package com.example.customer.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Value("${customer-service.name}")
    private String serviceName;

    /**
     * 获取服务名称
     *
     * @return
     */
    @GetMapping("/getServiceName")
    public String getServiceName() {
        return "从nacos获取到customer-service.yml配置文件的信息-服务名称：" + serviceName;

    }
}
