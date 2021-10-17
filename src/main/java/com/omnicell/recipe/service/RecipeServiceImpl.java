package com.omnicell.recipe.service;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.omnicell.recipe.exception.RecipeNotFound;
import com.omnicell.recipe.model.RecipeEntity;
import com.omnicell.recipe.repository.RecipeRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RecipeServiceImpl implements RecipeService {
	
	private RecipeRepository recipeRepo;
	
	@Autowired
	public RecipeServiceImpl(RecipeRepository recipeRepo) {
		this.recipeRepo = recipeRepo;
	}

	@Override
	public RecipeEntity getRecipeFromDb(Long id) throws Exception {
		try {
		return recipeRepo.getById(id);
		} catch (EntityNotFoundException ex) {
			throw new RecipeNotFound("Recipe not found by id "+ id);
		} catch (Exception ex) {
			log.error("Exception occured service ", ex);
			throw new Exception("Some Error occured");
		}
	}

	@Override
	public RecipeEntity addRecipeInDb(RecipeEntity recipeEntity) {
		return recipeRepo.save(recipeEntity);
	}

	@Override
	public String getRecipeImageFromDb(Long id) throws Exception {
		RecipeEntity recipe = getRecipeFromDb(id);
		if(recipe != null) {
			return recipe.getImage();
		}
		return null;
	}

}
