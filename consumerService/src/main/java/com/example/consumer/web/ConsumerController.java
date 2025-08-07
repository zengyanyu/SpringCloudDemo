package com.example.consumer.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Value("${consumer-service.name}")
    private String serviceName;

    /**
     * 获取服务名称
     *
     * @return
     */
    @GetMapping("/getServiceName")
    public String getServiceName() {
        return "从nacos获取到consumer-service.yml配置文件的信息-服务名称：" + serviceName;

    }
}
