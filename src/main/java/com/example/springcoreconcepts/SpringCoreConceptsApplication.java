package com.example.springcoreconcepts;

import com.example.springcoreconcepts.prototypeintosingletonbean.PrototypeBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.PrototypeLookupBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.SingletonBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.SingletonLookupBean;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringCoreConceptsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringCoreConceptsApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreConceptsApplication.class);
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
    }

}
