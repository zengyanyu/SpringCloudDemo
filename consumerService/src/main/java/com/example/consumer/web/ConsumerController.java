package com.example.consumer.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "消费者控制器", description = "消费者控制器")
@RestController
@RequestMapping("/consumer")
public class ConsumerController {

    @Value("${consumer-service.name}")
    private String serviceName;

    @ApiOperation("获取服务名称")
    @GetMapping("/getServiceName")
    public String getServiceName() {
        return "从nacos获取到consumer-service.yml配置文件的信息-服务名称：" + serviceName;
    }

}
