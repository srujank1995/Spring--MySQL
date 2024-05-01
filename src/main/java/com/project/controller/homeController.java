package com.project.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/")
public class homeController {

	@GetMapping("/")
	public String welcomeMessage(@RequestParam String param) {
		return "Hello welcome to Spring Boot Application .";
	}
	
}
