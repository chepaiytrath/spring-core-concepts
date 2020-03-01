package com.example.springcoreconcepts.prototypeintosingletonbean.solve.usingapplicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SingletonAppContextBean implements ApplicationContextAware {
    public SingletonAppContextBean() {
        System.out.println("Created SingletonAppContextBean");
    }

    private ApplicationContext applicationContext;

    public PrototypeAppContextBean getPrototypeAppContextBean() {
        return applicationContext.getBean(PrototypeAppContextBean.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}