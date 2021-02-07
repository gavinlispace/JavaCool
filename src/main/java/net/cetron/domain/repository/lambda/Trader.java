/*
 * @program: JavaCool
 * @description: 交易员
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: Trader.java
 * @author: Gavin Li
 * @create: 2021-04-11 16:15
 */
package net.cetron.domain.repository.lambda;


import lombok.Builder;
import lombok.Data;

/**
 * 交易员实体类
 */
@Data
@Builder
public class Trader {

    private String name;
    private String city;
}
