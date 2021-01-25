/*
 * @program: spring-boot-demo
 * @description: HSF表单提交类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: FormHsfSubmitHandler.java
 * @author: Gavin Li
 * @create: 2021-01-19 22:22
 */
package net.cetron.domain.repository.strategy.impl;

import net.cetron.domain.repository.strategy.FormSubmitHandler;
import net.cetron.domain.repository.strategy.FormSubmitRequest;
import org.springframework.stereotype.Component;

@Component
public class FormHsfSubmitHandler implements FormSubmitHandler {
    @Override
    public String getSubmitType() {
        return "hsf";
    }

    @Override
    public String handleSubmit(FormSubmitRequest formSubmitRequest) {
        return "HSF模式提交成功！";
    }
}
