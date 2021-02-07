/*
 * @program: spring-boot-demo
 * @description: 预览表单处理类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: FormPreviewSubmitHandler.java
 * @author: Gavin Li
 * @create: 2021-01-19 22:17
 */
package net.cetron.domain.repository.pattern.strategy.impl;

import lombok.extern.slf4j.Slf4j;
import net.cetron.domain.repository.pattern.strategy.FormSubmitRequest;
import net.cetron.domain.repository.pattern.strategy.FormSubmitHandler;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FormPreviewSubmitHandler implements FormSubmitHandler {
    @Override
    public String getSubmitType() {
        return "preview";
    }

    @Override
    public String handleSubmit(FormSubmitRequest formSubmitRequest) {
        return "预览模式提交数据成功！";
    }
}
