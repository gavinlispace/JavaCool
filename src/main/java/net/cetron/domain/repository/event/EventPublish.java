/*
 * @program: JavaCool
 * @description: 事件发布类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: EventPublish.java
 * @author: Gavin Li
 * @create: 2021-02-02 21:49
 */
package net.cetron.domain.repository.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublish {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String message){
        Event event = new Event(this, message);
        applicationEventPublisher.publishEvent(event);
    }

}
