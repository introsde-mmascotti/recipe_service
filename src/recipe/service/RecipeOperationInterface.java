package recipe.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import recipestorage.service.Ingredient;
import recipestorage.service.Recipe;

@WebService
@SOAPBinding(style=Style.DOCUMENT, use=Use.LITERAL)
public interface RecipeOperationInterface {
		
	@WebMethod
	public List<Recipe> findRecipe(
			@WebParam(name="search_item") String search_item, 
			@WebParam(name="author") String author);
	
	@WebMethod
	public List<Ingredient> findIngredient(@WebParam(name="search_term") String search_term);
		
	@WebMethod	
	public Recipe createInstantRecipe(
			@WebParam(name="recipe_name") String name,
			@WebParam(name="ingredients") Ingredient ingredient);

	@WebMethod
	public Recipe saveRecipe(
			@WebParam(name="recipe") Recipe recipe);

	@WebMethod
	public Recipe updateRecipeIngredients(
			@WebParam(name="recipe") Recipe r,
			@WebParam(name="ingredient") Ingredient ingr,
			@WebParam(name="amount") Double amount);
}
