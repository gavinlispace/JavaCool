/*
 * @program: JavaCool
 * @description: 事件服务类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: EventService.java
 * @author: Gavin Li
 * @create: 2021-02-02 21:53
 */
package net.cetron.service;

public interface EventService {

    /**
     * 发布消息
     * @param message
     */
    public void publish(String message);
}
