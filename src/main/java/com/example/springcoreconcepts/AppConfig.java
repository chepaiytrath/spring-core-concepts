package com.example.springcoreconcepts;

import com.example.springcoreconcepts.prototypeintosingletonbean.PrototypeBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.SingletonBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonBean singletonBean(){
        return new SingletonBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean(){
        return new PrototypeBean();
    }
}
