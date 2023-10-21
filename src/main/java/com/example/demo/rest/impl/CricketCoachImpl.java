package com.example.demo.rest.impl;

import com.example.demo.rest.Coach;
import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
@Log4j2
public class CricketCoachImpl implements Coach {

    public CricketCoachImpl() {
        log.info("In Constructor {}", getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practise Cricket Daily!!!!!!!!!!";
    }
}
