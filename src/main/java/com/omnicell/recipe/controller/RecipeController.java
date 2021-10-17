package com.omnicell.recipe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
	
	@GetMapping("/status")
	public String status() {
		return "UP";
		
	}

}
