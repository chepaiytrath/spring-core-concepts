package com.example.springcoreconcepts.beanlifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigBeanLifecycle {

    @Bean(initMethod = "customInit", destroyMethod = "customDestroy")
    public AwareBeanImpl awareBean() {
        return new AwareBeanImpl();
    }

    @Bean
    public MyBeanPostProcessor bookBeanPostProcessor(){
        return new MyBeanPostProcessor();
    }
}