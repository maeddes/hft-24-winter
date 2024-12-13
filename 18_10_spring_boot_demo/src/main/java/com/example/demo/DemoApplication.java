package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/crash")
	public String crash(){
	
		System.exit(1);
		return "working code"; //statement cannot be reached
	
	}

	@GetMapping("/hostname")
	public String getHostname(){

		try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return "Hostname: " + inetAddress.getHostName();
        } catch (UnknownHostException e) {
            return "Error retrieving hostname: " + e.getMessage();
        }

	}

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
