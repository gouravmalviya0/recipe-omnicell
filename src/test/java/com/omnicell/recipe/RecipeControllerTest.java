//package com.omnicell.recipe;
//
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.MockitoJUnitRunner;
//
//import com.omnicell.recipe.controller.RecipeController;
//import com.omnicell.recipe.model.RecipeEntity;
//import com.omnicell.recipe.service.RecipeServiceImpl;
//
//@RunWith(JunitPlatform)
//public class RecipeControllerTest {
//
//	@Mock
//	RecipeServiceImpl service;
//	
//	@InjectMocks
//	RecipeController recipeController =  new RecipeController(service);
//	
//	@Test
//	public void testFindByID() throws Exception {
//		RecipeEntity entity = new RecipeEntity();
//		when(service.getRecipeFromDb(Mockito.anyLong())).thenReturn(entity);
//		recipeController.getRecipe(1L);
//	}
//	
//	
//}
