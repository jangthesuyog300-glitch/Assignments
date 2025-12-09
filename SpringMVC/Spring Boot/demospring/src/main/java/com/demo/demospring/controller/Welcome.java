package com.demo.demospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	@GetMapping("/welcome")
	public String welcome() {
		return "WELCOME to our First SpringBoot Project!....";
	}
}
