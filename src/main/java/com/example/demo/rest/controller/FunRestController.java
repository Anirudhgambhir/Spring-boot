package com.example.demo.rest.controller;

import com.example.demo.rest.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    private final Coach coach;

    @Autowired
    public FunRestController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout() {
        return coach.getDailyWorkout();
    }


    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/test")
    public String getTestData() {
        return "Test-1 endpoint testing";
    }

    @GetMapping("/testing")
    public String getTesting() {
        return "TESTING";
    }


}