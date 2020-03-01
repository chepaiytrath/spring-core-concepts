package com.example.springcoreconcepts;

import com.example.springcoreconcepts.prototypeintosingletonbean.basic.PrototypeBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solve.usingapplicationcontext.PrototypeAppContextBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solve.usingapplicationcontext.SingletonAppContextBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solve.usinglookup.PrototypeLookupBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.basic.SingletonBean;
import com.example.springcoreconcepts.prototypeintosingletonbean.solve.usinglookup.SingletonLookupBean;
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


        System.out.println();

        SingletonAppContextBean firstSACB = context.getBean(SingletonAppContextBean.class);
        PrototypeAppContextBean firstPACB = firstSACB.getPrototypeAppContextBean();

        SingletonAppContextBean secondSACB = context.getBean(SingletonAppContextBean.class);
        PrototypeAppContextBean secondPACB = secondSACB.getPrototypeAppContextBean();


        System.out.println("SINGLETON APP CONTEXT BEANS ARE EQUAL : " + firstSACB.equals(secondSACB));
        System.out.println("PROTOTYPE APP CONTEXT BEANS ARE EQUAL : " + firstPACB.equals(secondPACB));

    }

}
