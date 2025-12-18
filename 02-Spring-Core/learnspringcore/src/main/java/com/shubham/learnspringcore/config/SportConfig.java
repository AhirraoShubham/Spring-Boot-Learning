/*
 * Copyright (C) 2025 Mr.Ahirrao - All Rights Reserved
 * Unauthorized copying or redistribution of this file in source and binary forms
 * via any medium is strictly prohibited.
 */

package com.shubham.learnspringcore.config;

import com.shubham.learnspringcore.common.Coach;
import com.shubham.learnspringcore.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic") // "aquatic" is a bean id.
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
