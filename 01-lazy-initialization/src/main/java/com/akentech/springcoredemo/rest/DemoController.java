package com.akentech.springcoredemo.rest;

import com.akentech.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    //Define a private field for the dependency
    private Coach myCoach;
    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach theCoach) {
        System.out.println("In Constructor : " +getClass().getSimpleName());
        myCoach = theCoach;
    }
@GetMapping("/dailyworkout")
    public String getDailyworkout() {
        return myCoach.getDailyWorkout();
}


}
