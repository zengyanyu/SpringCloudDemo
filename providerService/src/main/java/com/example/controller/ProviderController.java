package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${provider-service.name}")
    private String serviceName;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println("Provider service is called by: " + name);
        return "Hello " + name + "! This is a message from Provider Service.";
    }

    /**
     * 获取服务名称
     *
     * @return
     */
    @GetMapping("/getServiceName")
    public String getServiceName() {
        return "从nacos获取到provider-service.yml配置文件的信息-服务名称：" + serviceName;
    }
}
