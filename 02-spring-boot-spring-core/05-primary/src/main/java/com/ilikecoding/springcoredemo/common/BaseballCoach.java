package com.ilikecoding.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Hit that ball with the baseball bat 30 minutes.";
    }
}
