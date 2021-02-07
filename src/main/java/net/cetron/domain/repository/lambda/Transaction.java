/*
 * @program: JavaCool
 * @description: 交易明细
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: Transaction.java
 * @author: Gavin Li
 * @create: 2021-04-11 16:17
 */
package net.cetron.domain.repository.lambda;

import lombok.Builder;
import lombok.Data;

/**
 * 交易明细类
 */

@Data
@Builder
public class Transaction {

    /**
     * 交易员
     */
    private Trader trader;

    /**
     * 交易时间
     */
    private int year;

    /**
     * 交易金额
     */
    private int value;
}
