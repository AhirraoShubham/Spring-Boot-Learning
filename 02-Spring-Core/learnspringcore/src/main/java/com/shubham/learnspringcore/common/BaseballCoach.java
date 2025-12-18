/*
 * Copyright (C) 2025 Mr.Ahirrao - All Rights Reserved
 * Unauthorized copying or redistribution of this file in source and binary forms
 * via any medium is strictly prohibited.
 */

package com.shubham.learnspringcore.common;

import org.springframework.stereotype.Component;

@Component // @Component annotation marks the class as a Spring bean.
public class BaseballCoach implements Coach {

    public BaseballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
