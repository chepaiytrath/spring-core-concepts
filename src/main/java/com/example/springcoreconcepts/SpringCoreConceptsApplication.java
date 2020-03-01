package com.example.springcoreconcepts;

import com.example.springcoreconcepts.beanlifecycle.AppConfigBeanLifecycle;
import com.example.springcoreconcepts.beanlifecycle.AwareBeanImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreConceptsApplication.class, args);

        //SOLVING PROTOTYPE BEAN INJECTION INTO A SINGLETON BEAN
        //https://www.baeldung.com/spring-inject-prototype-bean-into-singleton

        //Testing for Prototype injection into Singleton Bean starts
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreConceptsApplication.class);
        SingletonBean firstSB = context.getBean(SingletonBean.class);
        PrototypeBean firstPB = firstSB.getPrototypeBean();

        SingletonBean secondSB = context.getBean(SingletonBean.class);
        PrototypeBean secondPB = secondSB.getPrototypeBean();


        System.out.println("SINGLETON BEANS ARE EQUAL : " + firstSB.equals(secondSB));
        System.out.println("PROTOTYPE BEANS ARE EQUAL : " + firstPB.equals(secondPB));

        System.out.println();

        SingletonLookupBean firstSLB = context.getBean(SingletonLookupBean.class);
        PrototypeLookupBean firstPLB = firstSLB.getPrototypeLookupBean();

        SingletonLookupBean secondSLB = context.getBean(SingletonLookupBean.class);
        PrototypeLookupBean secondPLB = secondSLB.getPrototypeLookupBean();


        System.out.println("SINGLETON LOOKUP BEANS ARE EQUAL : " + firstSLB.equals(secondSLB));
        System.out.println("PROTOTYPE LOOKUP BEANS ARE EQUAL : " + firstPLB.equals(secondPLB));


        System.out.println();

        SingletonAppContextBean firstSACB = context.getBean(SingletonAppContextBean.class);
        PrototypeAppContextBean firstPACB = firstSACB.getPrototypeAppContextBean();

        SingletonAppContextBean secondSACB = context.getBean(SingletonAppContextBean.class);
        PrototypeAppContextBean secondPACB = secondSACB.getPrototypeAppContextBean();


        System.out.println("SINGLETON APP CONTEXT BEANS ARE EQUAL : " + firstSACB.equals(secondSACB));
        System.out.println("PROTOTYPE APP CONTEXT BEANS ARE EQUAL : " + firstPACB.equals(secondPACB));*/
        //Testing for Prototype injection into Singleton Bean ends


        //Testing for multiple Singleton Beans starts
        /*SingletonBeanMultiple firstSBM = (SingletonBeanMultiple) context.getBean("SingletonBeanMultiple1");
        SingletonBeanMultiple secondSBM = (SingletonBeanMultiple) context.getBean("SingletonBeanMultiple2");
        DependentBean dependentBean = (DependentBean)  context.getBean(DependentBean.class);
        System.out.println("SINGLETON MULTIPLE BEANS ARE EQUAL : " + firstSBM.equals(secondSBM));
        System.out.println("DEPENDENT SINGLETON MULTIPLE BEAN : " + dependentBean.getSingletonBeanMultiple().getName());*/
        //Testing for multiple Singleton Beans ends



        //Testing for Bean lilfecycle starts
        //https://dzone.com/articles/spring-bean-lifecycle
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfigBeanLifecycle.class);
        AwareBeanImpl awareBeanImpl = (AwareBeanImpl) context.getBean("awareBean");
        //Testing for Bean lilfecycle ends
    }

}
