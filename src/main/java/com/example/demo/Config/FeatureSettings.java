package com.example.demo.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "feature")
public class FeatureSettings {

    private boolean toggleOn;

    private List<Feature> featureList;

    @Data
    public static class Feature {
        private String name;
        private boolean enabled;
    }
}
