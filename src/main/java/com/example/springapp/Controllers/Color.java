package com.example.springapp.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Color {
	
	String yourFavColor="Green";
	@GetMapping("/Color")
	public String getMyFav() {
		return "My favorite color is "+yourFavColor;
	}
	
}
