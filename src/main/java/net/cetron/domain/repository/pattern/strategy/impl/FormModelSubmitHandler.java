/*
 * @program: spring-boot-demo
 * @description: 模型输入表单提交类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: FormModelSubmitHandler.java
 * @author: Gavin Li
 * @create: 2021-01-19 22:20
 */
package net.cetron.domain.repository.pattern.strategy.impl;

import lombok.extern.slf4j.Slf4j;
import net.cetron.domain.repository.pattern.strategy.FormSubmitHandler;
import net.cetron.domain.repository.pattern.strategy.FormSubmitRequest;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FormModelSubmitHandler implements FormSubmitHandler {
    @Override
    public String getSubmitType() {
        return "model";
    }

    @Override
    public String handleSubmit(FormSubmitRequest formSubmitRequest) {
        return "模型提交成功！";
    }
}
