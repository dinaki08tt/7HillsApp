package com.sevenhills.db.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping("/hello")
	public String hello(@RequestParam String message) {
		
		if(message!=null && !message.isEmpty()) {
			return "Hello "+ message;
		}
		return "hello";
	}
	
	
}
