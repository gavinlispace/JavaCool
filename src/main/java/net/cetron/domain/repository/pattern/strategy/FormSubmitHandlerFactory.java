/*
 * @program: spring-boot-demo
 * @description: 表单提交工厂类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: FormSubmitHandlerFactory.java
 * @author: Gavin Li
 * @create: 2021-01-19 22:23
 */
package net.cetron.domain.repository.pattern.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Component
public class FormSubmitHandlerFactory implements InitializingBean, ApplicationContextAware {

    private static final Map<String, FormSubmitHandler<Serializable>> FORM_SUBMIT_HANDLER_MAP = new HashMap<>(8);

    private ApplicationContext applicationContext;

    /**
     * 获取handler
     * @param submitType
     * @return
     */
    public FormSubmitHandler<Serializable> getHandler(String submitType){
        log.info("=============FORM_SUBMIT_HANDLER_MAP:"+FORM_SUBMIT_HANDLER_MAP);
        log.info("=============getHandler:"+submitType);
        return FORM_SUBMIT_HANDLER_MAP.get(submitType);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("=============afterPropertiesSet");
        Collection<FormSubmitHandler> values = applicationContext.getBeansOfType(FormSubmitHandler.class).values();
        log.info("=============values:"+values);
        values.forEach(handler-> FORM_SUBMIT_HANDLER_MAP.put(handler.getSubmitType(), handler));
        log.info("=============FORM_SUBMIT_HANDLER_MAP:"+FORM_SUBMIT_HANDLER_MAP);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        log.info("=============setApplicationContext");
        this.applicationContext = applicationContext;
    }
}
