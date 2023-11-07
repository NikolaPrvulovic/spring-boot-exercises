package com.ilikecoding.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{

    public TenisCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Hangout with Novak Djokovic for 3 hours.";
    }
}
