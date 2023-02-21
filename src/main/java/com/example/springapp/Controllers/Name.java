package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {


	String studentName="iAmNeo";
	@GetMapping("/Name")
	public String getName() {
		return "Welcome "+studentName+"!";
	}
	
}
