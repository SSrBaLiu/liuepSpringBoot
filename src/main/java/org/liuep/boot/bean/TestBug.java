package org.liuep.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "testbug01")
@Component
@ToString
@Data
public class TestBug {
    private String name;
}
