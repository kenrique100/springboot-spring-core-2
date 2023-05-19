package com.akentech.springcoredemo.config;

import com.akentech.springcoredemo.common.Coach;
import com.akentech.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportCofig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
