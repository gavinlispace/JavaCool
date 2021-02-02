/*
 * @program: JavaCool
 * @description: 事件服务实现类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: EventServiceImpl.java
 * @author: Gavin Li
 * @create: 2021-02-02 21:53
 */
package net.cetron.service.impl;

import net.cetron.domain.repository.event.EventPublish;
import net.cetron.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventPublish eventPublish;

    @Override
    public void publish(String message) {
        eventPublish.publish(message);
    }
}
