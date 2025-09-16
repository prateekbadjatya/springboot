package com.luv2code.util;

import org.springframework.stereotype.Component;

//@component mark the class as spring bean

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice Fast bowling for 90 minutes";
    }
}
