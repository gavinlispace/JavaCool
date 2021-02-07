/*
 * @program: JavaCool
 * @description: Lambda测试类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: LambdaTest.java
 * @author: Gavin Li
 * @create: 2021-04-11 16:19
 */
package net.cetron.domain.repository.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LambdaTest {

    /**
     * (1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
     * (2) 交易员都在哪些不同的城市工作过？
     * (3) 查找所有来自于剑桥的交易员，并按姓名排序。
     * (4) 返回所有交易员的姓名字符串，按字母顺序排序。
     * (5) 有没有交易员是在米兰工作的？
     * (6) 打印生活在剑桥的交易员的所有交易额。
     * (7) 所有交易中，最高的交易额是多少？
     * (8) 找到交易额最小的交易。
     */

    public static void main(String[] args) {
        //初始化数据
        Trader gavin = Trader.builder().name("Gavin").city("WUHAN").build();
        Trader roger = Trader.builder().name("Roger").city("SHANGHAI").build();
        Trader flame = Trader.builder().name("Flame").city("WUHAN").build();
        Trader alan = Trader.builder().name("Alan").city("WUHAN").build();

        //交易明细
        List<Transaction> transactions = Arrays.asList(
                new Transaction(gavin, 2011, 300),
                new Transaction(roger, 2012, 1000),
                new Transaction(roger, 2011, 400),
                new Transaction(flame, 2012, 710),
                new Transaction(flame, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        //(1) 找出2011年发生的所有交易，并按交易额排序（从低到高）。
        List<Transaction> collect = transactions.stream().filter(a -> a.getYear() == 2011).sorted(Comparator.comparingInt(Transaction::getValue)).collect(Collectors.toList());
        collect.forEach(transaction -> {
            System.out.println(transaction);
        });

        //(2) 交易员都在哪些不同的城市工作过？
        List<String> collect1 = transactions.stream().map(transaction -> transaction.getTrader().getCity()).distinct().collect(Collectors.toList());
        collect1.forEach(name -> {
            System.out.println("City name:"+ name);
        });

        //(3) 查找所有来自于武汉的交易员，并按姓名排序。
        List<Trader> wuhan = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("WUHAN"))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName)).collect(Collectors.toList());
        wuhan.forEach(trader -> {
            System.out.println(trader);
        });

        //(4) 返回所有交易员的姓名字符串，按字母顺序排序。
        String reduce = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (n1, n2) -> n1 +","+ n2);
        System.out.println("reduce:"+reduce);

        //(5) 有没有交易员是在上海工作的？
        boolean shanghai = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equals("SHANGHAI"))
                .findAny().isPresent();

        boolean shanghai1 = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("SHANGHAI"));

        System.out.println("shanghai:"+ shanghai);

        //(6) 打印生活在武汉的交易员的所有交易额。
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("WUHAN"))
                .map(Transaction::getValue)
                .forEach(System.out::println);

        //(7) 所有交易中，最高的交易额是多少？
        Integer integer = transactions.stream().map(transaction -> transaction.getValue()).max(Integer::compareTo).get();
        Optional<Integer> reduce1 = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        System.out.println("max:"+integer);

        //(8) 找到交易额最小的交易。
        Transaction transaction = transactions.stream().sorted(Comparator.comparing(Transaction::getValue)).findFirst().get();
        Optional<Transaction> reduce2 = transactions.stream().reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2);
        Optional<Transaction> min = transactions.stream().min(Comparator.comparing(Transaction::getValue));

        System.out.println("Min transaction:"+transaction);
    }
}
