/*
 * @(#)Swagger2Config.java
 * Copyright (c) 1999-2020 Www.Cetron.Net, Inc.
 * This software is the confidential and proprietary information of Cetron.Net,
 * Inc. ("Confidential Information").  You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with Cetron.Net.
 */

package net.cetron.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createRestAPI(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(this.getApiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("net.cetron.controller"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo getApiInfo(){
        return new ApiInfoBuilder().title("JavaCool")
                .contact(new Contact("Gavin", "http://www.javacool.cn", "admin@javacool.cn"))
                .version("V0.0.1").build();
    }
}
