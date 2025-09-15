package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // Reading property from application.properties
    @Value("${coach.name}")
    private String coachName;


    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello() {
        return "Hello World From " + coachName + " "  + teamName;
    }

    @GetMapping("/goodbye")
    public String sayBye() {
        return "Bye! Hello World";
    }
}
