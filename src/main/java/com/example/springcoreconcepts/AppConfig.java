package com.example.springcoreconcepts;

import com.example.springcoreconcepts.prototypeintosingletonbean.basic.PrototypeBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.basic.SingletonBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solution.usingapplicationcontext.PrototypeAppContextBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solution.usingapplicationcontext.SingletonAppContextBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonBean singletonBean() {
        return new SingletonBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeBean prototypeBean() {
        return new PrototypeBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonAppContextBean singletonAppContextBean() {
        return new SingletonAppContextBean();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public PrototypeAppContextBean prototypeAppContextBean() {
        return new PrototypeAppContextBean();
    }
}
