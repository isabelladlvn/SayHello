package com.example.SayHello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SayHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SayHelloApplication.class, args);
	}

	@RestController
	class HelloController {
		@GetMapping("/hello")
		public String sayHello() {
			return "Hello World";
		}
	}

}
