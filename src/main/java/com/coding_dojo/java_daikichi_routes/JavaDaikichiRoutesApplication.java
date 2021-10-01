package com.coding_dojo.java_daikichi_routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//2. Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RestController
public class JavaDaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaDaikichiRoutesApplication.class, args);
	}
	
	@RequestMapping("/daikichi")
    public String welcome() {
            return "Welcome!";
    }
	
	@RequestMapping("/daikichi/today")
    public String todayfortune() {
            return "Today you will find luck in all your endeavors!";
    }
	
	@RequestMapping("/daikichi/tomorrow")
    public String tomorrowfortune() {
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
    }

}
