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

import net.cetron.domain.repository.strategy.FormSubmitRequest;
import net.cetron.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QuickTestController {

    @Autowired
    private FormService formService;

    @RequestMapping("/")
    public String test(){
        return "Hello world! Today is good day!";
    }

    @GetMapping("/submit")
    public String submitForm(@RequestParam String submitType){
        FormSubmitRequest formSubmitRequest = new FormSubmitRequest();
        formSubmitRequest.setUserId(1L);
        formSubmitRequest.setSubmitType(submitType);
        return formService.submitForm(formSubmitRequest);
    }
}
