package org.liuep.boot.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@ConfigurationProperties(prefix = "player01")
@Component
@ToString
@Data
public class Player {
    private String userName;
    private Integer LV;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private Pet pet;
    private String[] interests;
    private List<String> friends;
    private Map<String,Object> score;
    private Set<Double> salary;
    private Map<String,List<Pet>> allPets;
}
