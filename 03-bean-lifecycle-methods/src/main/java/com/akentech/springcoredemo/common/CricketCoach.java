package com.akentech.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println("In Constructor : " +getClass().getSimpleName());
    }

    //* Define our init method
    @PostConstruct
    public void doMyStartUpStuff() {
        System.out.println("In doMyStartUpStuff(): " + getClass().getSimpleName());
    }
    //* Define our destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {

        return "Practice Fast Bowling For 15minutes";
    }
}
