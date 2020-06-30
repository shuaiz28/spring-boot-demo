package com.example.demo.Controllers;

import com.example.demo.Config.FeatureSettings;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private FeatureSettings featureSettings;

    @GetMapping("/greeting-person")
    public String getGreetingPerson() {
        return greetingPerson;
    }

    @GetMapping("/greeting-info")
    public String getGreetingInfo() {
        return greetingInfo;
    }

    @GetMapping("/is-feature-toggle-on")
    public boolean getFeatureToggle() {
        return featureSettings.isToggleOn();
    }

    @GetMapping("/feature-settings")
    public String getFeatureSettings() {
        return featureSettings.getFeatureList().toString();
    }
}
