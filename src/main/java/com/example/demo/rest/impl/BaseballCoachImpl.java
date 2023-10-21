package com.example.demo.rest.impl;

import com.example.demo.rest.Coach;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class BaseballCoachImpl implements Coach {

    public BaseballCoachImpl() {
        log.info("In Constructor {}", getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball practise in needed everyday";
    }
}
