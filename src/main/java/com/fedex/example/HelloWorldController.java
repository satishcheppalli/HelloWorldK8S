package com.fedex.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		String email_id="";
		if(System.getenv("SUPPORT_EMAIL_ID") != null && System.getenv("SUPPORT_EMAIL_ID") != ""){
			email_id = System.getenv("SUPPORT_EMAIL_ID");
			System.out.println(email_id);
		}
		System.out.println("*********Welcome to LHL********");
		return "<h2>Welcome to LHL... "+email_id+" !!!</h2>";
	}
}
