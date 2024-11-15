package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	@GetMapping("/getHello")
	public String sayHello(){

		return "Hallo, Hft! (GET Call)";

	}

	@PostMapping("/postHello")
	public String postHello(){

		return "Hallo, Hft! (POST Call)";

	}

	@GetMapping("/hello/{name}")
	public String sayHelloWithParameter(@PathVariable String name){

		return "Hallo, "+name;

	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
