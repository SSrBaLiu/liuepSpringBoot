package org.liuep.boot.config;

import org.liuep.boot.bean.Person;
import org.liuep.boot.bean.Pet;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.*;

@ImportResource("classpath:beans.xml")
@Configuration
public class MyConfig {
    @Bean
    public Pet pet01(){
        return new Pet("tom");
    }

    @ConditionalOnBean(name = "pet01")
    @Bean("person01")
    public Person person(){
        //该组件依赖于另一个组件
        return new  Person("zhangsan",pet01());
    }
}

