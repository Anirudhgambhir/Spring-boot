package com.example.demo.rest;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {


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
