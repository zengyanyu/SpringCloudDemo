package com.example.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "提供者控制器")
@RestController
@RequestMapping("/provider")
public class ProviderController {

    @Value("${provider-service.name}")
    private String serviceName;

    @ApiOperation("提供者hello接口")
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println("Provider service is called by: " + name);
        return "Hello " + name + "! This is a message from Provider Service.";
    }

    @ApiOperation("获取服务名称")
    @GetMapping("/getServiceName")
    public String getServiceName() {
        return "从nacos获取到provider-service.yml配置文件的信息-服务名称：" + serviceName;
    }
}
