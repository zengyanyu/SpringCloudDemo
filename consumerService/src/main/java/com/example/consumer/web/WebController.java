package com.example.consumer.web;

import com.example.consumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class WebController {

    @Autowired
    private ProviderClient providerClient;

    // 调用Provider
    @GetMapping("/call-provider/{name}")
    public String callProvider(@PathVariable String name, Model model) {
        String message = providerClient.sayHello(name);
        System.out.println("message = " + message);
        model.addAttribute("message", message);
        model.addAttribute("service", "Provider Service");
        return "result"; // 返回 result.html 模板
    }

    // 调用consumer
    @GetMapping("/call-consumer/{name}")
    public String callConsumer(@PathVariable String name, Model model) {
        model.addAttribute("message", "hello: " + name);
        model.addAttribute("service", "Consumer Service");
        return "result"; // 返回 result.html 模板
    }
}
