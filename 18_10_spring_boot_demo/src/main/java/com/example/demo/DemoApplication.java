package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/hello")
	public String sayHello(){

		return "Hallo, Hft!";

	}

	@GetMapping("/hello/{name}")
	public String sayHelloWithParameter(@PathVariable String name){

		return "Hallo, "+name;

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
