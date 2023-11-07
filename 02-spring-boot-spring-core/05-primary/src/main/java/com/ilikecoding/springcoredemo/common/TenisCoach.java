package com.ilikecoding.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TenisCoach implements Coach{
    @Override
    public String getDailyWorkout(){
        return "Hangout with Novak Djokovic for 3 hours.";
    }
}
