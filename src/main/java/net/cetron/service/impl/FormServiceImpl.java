/*
 * @program: spring-boot-demo
 * @description: 表单提交服务实现类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: FormServiceImpl.java
 * @author: Gavin Li
 * @create: 2021-01-19 22:32
 */
package net.cetron.service.impl;

import lombok.extern.slf4j.Slf4j;
import net.cetron.domain.repository.strategy.FormSubmitRequest;
import net.cetron.domain.repository.strategy.FormSubmitHandler;
import net.cetron.domain.repository.strategy.FormSubmitHandlerFactory;
import net.cetron.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
@Slf4j
public class FormServiceImpl implements FormService {

    @Autowired
    private FormSubmitHandlerFactory formSubmitHandlerFactory;

    @Override
    public String submitForm(FormSubmitRequest formSubmitRequest) {
        String submitType = formSubmitRequest.getSubmitType();
        log.info("=========submitType:"+submitType);
        FormSubmitHandler<Serializable> handler = formSubmitHandlerFactory.getHandler(submitType);
        return handler.handleSubmit(formSubmitRequest);
    }
}
