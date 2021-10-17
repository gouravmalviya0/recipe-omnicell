package com.omnicell.recipe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omnicell.recipe.model.RecipeEntity;
import com.omnicell.recipe.service.RecipeService;

@RestController
public class RecipeController {
	
	private RecipeService service;
	
	@Autowired
	public RecipeController(RecipeService service) {
		this.service = service;
	}
	
	@GetMapping(value = "/recipes/{id}")
	public ResponseEntity<RecipeEntity> getRecipe(@PathVariable Long id) throws Exception {
		return new ResponseEntity<RecipeEntity>(service.getRecipeFromDb(id), HttpStatus.OK);
	}
	
	@PostMapping("/recipes")
	public ResponseEntity<RecipeEntity> addRecipe(@RequestBody RecipeEntity recipeEntity) {
		return new ResponseEntity<RecipeEntity>(service.addRecipeInDb(recipeEntity), HttpStatus.OK);
	}
	
	@GetMapping("/recipes/{id}/show")
	public ResponseEntity<String> getRecipeImage(@PathVariable Long id) throws Exception {
		return new ResponseEntity<String>(service.getRecipeImageFromDb(id), HttpStatus.OK);
	}

}
