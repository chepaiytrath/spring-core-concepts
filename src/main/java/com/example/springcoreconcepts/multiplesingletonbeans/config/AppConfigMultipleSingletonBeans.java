package com.example.springcoreconcepts.multiplesingletonbeans.config;

import com.example.springcoreconcepts.prototypeintosingletonbean.basic.PrototypeBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.basic.SingletonBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solution.usingapplicationcontext.PrototypeAppContextBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solution.usingapplicationcontext.SingletonAppContextBean;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfigMultipleSingletonBeans {

    @Bean("SingletonBeanMultiple1")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonBeanMultiple singletonBeanMultiple1() {
        return new SingletonBeanMultiple("JATIN");
    }

    @Bean("SingletonBeanMultiple2")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public SingletonBeanMultiple singletonBeanMultiple2() {
        return new SingletonBeanMultiple("RAKESH");
    }
}