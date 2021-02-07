/*
 * @program: spring-boot-demo
 * @description: 表单提交服务类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: FormService.java
 * @author: Gavin Li
 * @create: 2021-01-19 22:31
 */
package net.cetron.service;

import net.cetron.domain.repository.pattern.strategy.FormSubmitRequest;
import org.springframework.stereotype.Service;

@Service
public interface FormService {
    String submitForm(FormSubmitRequest formSubmitRequest);
}
