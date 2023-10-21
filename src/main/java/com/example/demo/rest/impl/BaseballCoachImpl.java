package com.example.demo.rest.impl;

import com.example.demo.rest.Coach;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoachImpl implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Baseball practise in needed everyday";
    }
}
