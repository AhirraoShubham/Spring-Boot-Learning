/*
 * Copyright (C) 2025 Mr.Ahirrao - All Rights Reserved
 * Unauthorized copying or redistribution of this file in source and binary forms
 * via any medium is strictly prohibited.
 */

package com.shubham.learnspringcore.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // @Component annotation marks the class as a Spring bean.
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // With Prototype scope New object instance for each injection
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

//    // define our init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff(): "+getClass().getSimpleName());
//    }
//
//    // define our destroy method
//    @PreDestroy
//    public void doMyCleanupStuff() {
//        System.out.println("In doMyCleanupStuff(): "+getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
