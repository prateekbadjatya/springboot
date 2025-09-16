package com.luv2code.springboot.demo.mycoolapp.rest;

import com.luv2code.util.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Autowired
    CricketCoach cricketCoach; // outside spring boot main application we have for depedency
    // injection we have to manually told and give the searched package name

//   like this in starting file whre it is define
//    @SpringBootApplication(
//            scanBasePackages={"com.luv2code.springcoredemo",
//                    "com.luv2code.util",
//                    "org.acme.cart",
//                    "edu.cmu.srs"})
//    public class SpringcoredemoApplication {

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
