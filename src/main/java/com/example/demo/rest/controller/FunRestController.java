package com.example.demo.rest.controller;

import com.example.demo.rest.Coach;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Log4j2
public class FunRestController {

    private final Coach coach;

    public FunRestController(@Qualifier("getSwimCoach") Coach coach) {
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
