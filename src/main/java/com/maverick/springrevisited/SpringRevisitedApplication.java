package com.maverick.springrevisited;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringRevisitedApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRevisitedApplication.class, args);
	}


	@RestController
	public class HelloController{
		@RequestMapping(value = "/hello")
		public String welcome(){
			return "hello World!!";
		}
	}
}
