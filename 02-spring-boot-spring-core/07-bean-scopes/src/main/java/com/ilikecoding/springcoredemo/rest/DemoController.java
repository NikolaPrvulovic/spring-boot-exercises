package com.ilikecoding.springcoredemo.rest;

import com.ilikecoding.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    // define a private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    // define a constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("tenisCoach") Coach theCoach,
                          @Qualifier("tenisCoach") Coach anotherCoach){
        System.out.println("In constructor: " + getClass().getSimpleName());
        this.myCoach = theCoach;
        this.anotherCoach = anotherCoach;

    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return this.myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check(){
        return "Beans are the same: " + (this.myCoach == this.anotherCoach);
    }

}
