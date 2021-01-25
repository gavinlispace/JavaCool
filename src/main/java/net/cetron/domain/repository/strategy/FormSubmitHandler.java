/*
 * @program: spring-boot-demo
 * @description: 表单提交处理器
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: FormSubmitHandler.java
 * @author: Gavin Li
 * @create: 2021-01-19 22:10
 */
package net.cetron.domain.repository.strategy;

import java.io.Serializable;

public interface FormSubmitHandler<R extends Serializable> {

    /**
     * 获得提交类型
     * @return
     */
    String getSubmitType();

    String handleSubmit(FormSubmitRequest formSubmitRequest);
}
