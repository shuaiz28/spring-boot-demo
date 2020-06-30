package com.example.demo.Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-configuration-demo")
public class SpringConfigurationDemoController {

    @Value("${greeting.name}")
    private String greetingPerson;

    @Value("${greeting.info}")
    private String greetingInfo;

    @GetMapping("/greeting-person")
    public String getGreetingPerson() {
        return greetingPerson;
    }

    @GetMapping("/greeting-info")
    public String getGreetingInfo() {
        return greetingInfo;
    }
}
