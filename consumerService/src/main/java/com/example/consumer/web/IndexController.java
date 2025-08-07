package com.example.consumer.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Api(tags = "Index控制器", description = "Index控制器")
@Controller
public class IndexController {

    @ApiOperation("跳转到Index页面")
    @GetMapping("/html")
    public String html() {
        return "index";
    }
}
