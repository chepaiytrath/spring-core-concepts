package com.example.springcoreconcepts.prototypeintosingletonbean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrototypeLookupBean {
    public PrototypeLookupBean() {
        System.out.println("Created PrototypeLookupBean");
    }
}
