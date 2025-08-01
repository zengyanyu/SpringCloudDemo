package com.example.customer.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider-service") // 指定要调用的服务名
public interface ProviderClient {

    @GetMapping("/provider/hello/{name}")
    String sayHello(@PathVariable("name") String name);
}
