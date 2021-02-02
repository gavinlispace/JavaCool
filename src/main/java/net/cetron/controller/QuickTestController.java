/*
 * @program: JavaCool
 * @description: 快速测试类
 *
 * Copyright (c) 1999-2021 Www.Cetron.Net
 * This software is the confidential and proprietary information of Cetron.Net
 *
 * @class: QuickTestController.java
 * @author: Gavin Li
 * @create: 2021-01-25 20:31
 */
package net.cetron.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.cetron.domain.repository.strategy.FormSubmitRequest;
import net.cetron.service.EventService;
import net.cetron.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(tags = "快速测试接口")
public class QuickTestController {

    @Autowired
    private FormService formService;

    @Autowired
    private EventService eventService;

    @GetMapping("/")
    @ApiOperation(value = "入口测试")
    public String test(){
        return "Hello world! Today is good day!";
    }

    @GetMapping("/submit")
    @ApiOperation(value = "策略模式示例")
    public String submitForm(@RequestParam String submitType){
        FormSubmitRequest formSubmitRequest = new FormSubmitRequest();
        formSubmitRequest.setUserId(1L);
        formSubmitRequest.setSubmitType(submitType);
        return formService.submitForm(formSubmitRequest);
    }


    @GetMapping("/event")
    @ApiOperation(value = "发布事件测试")
    public void event(String message){
        eventService.publish(message);
    }
}
