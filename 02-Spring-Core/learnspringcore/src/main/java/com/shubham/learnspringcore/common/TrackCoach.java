/*
 * Copyright (C) 2025 Mr.Ahirrao - All Rights Reserved
 * Unauthorized copying or redistribution of this file in source and binary forms
 * via any medium is strictly prohibited.
 */

package com.shubham.learnspringcore.common;

import org.springframework.stereotype.Component;

@Component // @Component annotation marks the class as a Spring bean.
//@Primary // Since there are multiple implementations, we are making TrackCoach as the PRIMARY coach.
//@Lazy // This will initialize when we use it.
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
}
