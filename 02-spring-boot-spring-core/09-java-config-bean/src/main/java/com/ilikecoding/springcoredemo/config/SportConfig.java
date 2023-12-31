package com.ilikecoding.springcoredemo.config;

import com.ilikecoding.springcoredemo.common.Coach;
import com.ilikecoding.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
