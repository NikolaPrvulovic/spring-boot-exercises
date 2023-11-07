package com.ilikecoding.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Hit that ball with the baseball 30 minutes.";
    }
}
