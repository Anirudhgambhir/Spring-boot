package com.example.demo.rest.impl;

import com.example.demo.rest.Coach;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SwimCoachImpl implements Coach {

    public SwimCoachImpl() {
        log.info("SWIM COACH ACTIVATED");
    }

    @Override
    public String getDailyWorkout() {
        return "SWIMMING DAILY!!!!";
    }
}
