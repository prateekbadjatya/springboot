package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Autowired
    CricketCoach cricketCoach;

    @Autowired
    public FunRestController(CricketCoach cricketCoach) {
        this.cricketCoach = cricketCoach;
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World From";
    }

    @GetMapping("/dailyWorkout")
    public String dailyWorkout() {
        return this.cricketCoach.getDailyWorkout();
    }
}
