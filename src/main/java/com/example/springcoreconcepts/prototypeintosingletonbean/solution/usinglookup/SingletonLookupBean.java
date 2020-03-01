package com.example.springcoreconcepts.prototypeintosingletonbean.solution.usinglookup;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class SingletonLookupBean {
    public SingletonLookupBean() {
        System.out.println("Created SingletonLookupBean");
    }

    /*@Autowired
    private PrototypeBean prototypeBean;*/

    @Lookup
    public PrototypeLookupBean getPrototypeLookupBean() {
        return null;
    }
}
