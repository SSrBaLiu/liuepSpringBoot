package org.liuep.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * 主程序类
 * @SpringBootApplication:这是一个SpringBoot应用
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);
//        System.out.println("是否存在person组件"+run.containsBean("person01"));
//        System.out.println("是否存在cat宠物"+run.containsBean("cat"));
//        System.out.println("是否存在dog宠物"+run.containsBean("dog"));
    }
}
