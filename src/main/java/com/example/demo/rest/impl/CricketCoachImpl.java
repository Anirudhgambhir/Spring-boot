package com.example.demo.rest.impl;

import com.example.demo.rest.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoachImpl implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Practise Cricket Daily!!!!!!!!!!";
    }
}
