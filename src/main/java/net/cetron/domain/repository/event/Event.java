/*
 * @program: JavaCool
 * @description: 事件类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: Event.java
 * @author: Gavin Li
 * @create: 2021-02-02 21:45
 */
package net.cetron.domain.repository.event;

import org.springframework.context.ApplicationEvent;

public class Event extends ApplicationEvent {

    private String message;

    public Event(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
