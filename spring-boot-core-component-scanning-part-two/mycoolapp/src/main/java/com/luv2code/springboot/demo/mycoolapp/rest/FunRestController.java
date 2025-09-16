package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.springboot.demo.mycoolapp.common.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Autowired
    CricketCoach cricketCoach; // field injection not recommended

//    @Autowired
//    public FunRestController(CricketCoach cricketCoach) {
//        this.cricketCoach = cricketCoach;
//    }

//    @Autowired
//    public void setCricketCoach(CricketCoach cricketCoach) {
//        this.cricketCoach = cricketCoach;
//    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello World From";
    }

    @GetMapping("/dailyWorkout")
    public String dailyWorkout() {
        return this.cricketCoach.getDailyWorkout();
    }
}
