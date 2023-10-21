package com.example.demo.configuration;

import com.example.demo.rest.Coach;
import com.example.demo.rest.impl.SwimCoachImpl;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Log4j2
public class CoachConfiguration {

    @Bean
    public Coach getSwimCoach(){
        return new SwimCoachImpl();
    }
}
