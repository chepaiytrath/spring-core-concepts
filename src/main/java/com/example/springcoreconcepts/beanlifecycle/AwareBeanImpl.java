package com.example.springcoreconcepts.beanlifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Arrays;

public class AwareBeanImpl implements ApplicationContextAware, BeanNameAware, BeanFactoryAware, InitializingBean, DisposableBean {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory method of AwareBeanImpl is called");
        System.out.println("setBeanFactory:: AwareBeanImpl singleton = " + beanFactory.isSingleton("awareBean"));
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("setBeanName method of AwareBeanImpl is called");
        System.out.println("setBeanName:: Bean Name defined in context = " + beanName);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext method of AwareBeanImpl is called");
        System.out.println("setApplicationContext:: Bean Definition Names = " + Arrays.toString(applicationContext.getBeanDefinitionNames()));
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet method of AwareBeanImpl bean called !! ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method of AwareBeanImpl bean called !! ");
    }

    public void customInit() throws Exception {
        System.out.println("Custom Init method of AwareBeanImpl called !! ");
    }

    public void customDestroy() throws Exception {
        System.out.println("Custom destroy method of AwareBeanImpl called !! ");

    }

}