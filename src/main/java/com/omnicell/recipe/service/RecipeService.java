package com.omnicell.recipe.service;

import com.omnicell.recipe.exception.RecipeNotFound;
import com.omnicell.recipe.model.RecipeEntity;

public interface RecipeService {

	RecipeEntity getRecipeFromDb(Long id) throws Exception;

	RecipeEntity addRecipeInDb(RecipeEntity recipeEntity);

	String getRecipeImageFromDb(Long id) throws RecipeNotFound, Exception;

}
