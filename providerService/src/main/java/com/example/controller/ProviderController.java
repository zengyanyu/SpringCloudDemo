package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        System.out.println("Provider service is called by: " + name);
        return "Hello " + name + "! This is a message from Provider Service.";
    }
}
