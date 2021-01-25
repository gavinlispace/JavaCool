/*
 * @program: JavaCool
 * @description: 启动类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: JavaCoolApplication.java
 * @author: Gavin Li
 * @create: 2021-01-25 20:26
 */
package net.cetron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaCoolApplication.class, args);
    }
}
