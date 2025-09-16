package com.luv2code.springboot.demo.mycoolapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//my default it scan for current package where tis file exists
// if we have create ppackage outside this then we have to manually told here

@SpringBootApplication(
		scanBasePackages = {
				"com.luv2code.springboot.demo.mycoolapp",
				"com.luv2code.util"
		}
)
public class MycoolappApplication {
	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}
}
