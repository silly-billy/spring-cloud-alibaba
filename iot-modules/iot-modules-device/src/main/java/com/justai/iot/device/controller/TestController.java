package com.justai.iot.device.controller;

import com.justai.api.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xuming
 * @data 2024-05-10 14:48
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Value("${api.test}")
    private String test;

    @DubboReference
    private DemoService demoService;

    @GetMapping("/{message}")
    public String test(@PathVariable String message) {
        return test + message;
    }

    @GetMapping("/dubbo")
    public Object dubbo() {
        return demoService.sayHello("dubbo");
    }
}
