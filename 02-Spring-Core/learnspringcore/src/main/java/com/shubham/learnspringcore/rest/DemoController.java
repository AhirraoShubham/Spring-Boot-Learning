/*
 * Copyright (C) 2025 Mr.Ahirrao - All Rights Reserved
 * Unauthorized copying or redistribution of this file in source and binary forms
 * via any medium is strictly prohibited.
 */

package com.shubham.learnspringcore.rest;

import com.shubham.learnspringcore.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // Define a private field for the dependency
    private Coach myCoach;

    // For scope beans
    // private Coach anotherCoach;

//    // Define a constructor for dependency injection.
//
//    // The @Autowired annotation tells Spring to inject a dependency.
//    // If you only have one constructor then @Autowired on constructor us optional.
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

//    @Autowired
//    public void setCoach(Coach theCoach) {
//        myCoach = theCoach;
//    }

//    This is using @Qualifier annotation.
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
//        myCoach = theCoach;
//    }

//    // No need for @Qualifier. There is @Primary coach.
//    // This example used TrackCoach.
//    @Autowired
//    public DemoController(Coach theCoach) {
//        myCoach = theCoach;
//    }

//    // Lazy initialization practice
//    @Autowired
//    public DemoController(
//            @Qualifier("cricketCoach") Coach theCoach) {
//        System.out.println("In constructor: " + getClass().getSimpleName());
//        myCoach = theCoach;
//    }

//    // Scope Bean
//    // The Default scope is singleton
//    // (All dependency injections for the bean will reference the SAME bean)
//    @Autowired
//    public DemoController(
//            @Qualifier("cricketCoach") Coach theCoach,
//            @Qualifier("cricketCoach") Coach theAnotherCoach) {
//        System.out.println("In constructor: " + getClass().getSimpleName());
//        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
//    }

//    @GetMapping("/check")
//    public String check() {
//        return "Comparing beans: myCoach == anotherCoach, is " + (myCoach == anotherCoach);
//    }

//    // Bean Lifecycle
//    @Autowired
//    public DemoController(
//            @Qualifier("cricketCoach") Coach theCoach) {
//        System.out.println("In constructor: " + getClass().getSimpleName());
//        myCoach = theCoach;
//    }

    // Alternate way without @Component Annotations
    // Remember: SwimCoach did not have @Component annotation.
    // instead, we configured as a Spring bean using @Bean.
    @Autowired
    public DemoController(
            @Qualifier("aquatic") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
