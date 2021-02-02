/*
 * @program: JavaCool
 * @description: 监听事件类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: EventListener.java
 * @author: Gavin Li
 * @create: 2021-02-02 21:47
 */
package net.cetron.domain.repository.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener implements ApplicationListener<Event> {

    @Override
    public void onApplicationEvent(Event event) {
        System.out.println(" message received:" + event.getMessage());
    }
}
