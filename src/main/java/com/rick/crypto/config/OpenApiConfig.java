package com.rick.crypto.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("API  演示定义")
                        .description("Insomnia 是一个开源桌面应用程序，它提供了设计、调试和测试API的简单方法。\n" +
                                "\n" +
                                "通过对开发者友好的界面、内置的自动化和可扩展的插件生态系统，更快、更好地构建更好的API。")
                        .contact(new Contact().name("作者").email("39002818x@qq.com").url("http://www.csdn.net"))
                        .version("v1.0"));
    }

}

