package recipe.service;

import java.util.List;

import javax.jws.WebService;

import mapper.Mapper;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import recipestorage.service.Ingredient;
import recipestorage.service.Recipe;
import recipestorage.service.RecipeDBInterface;
import recipestorage.service.RecipeDBService;
import fooddata.adapter.service.Product;
import fooddata.adapter.service.RetrieveInterface;
import fooddata.adapter.service.RetrieveService;

@WebService
public class RecipeOperation implements RecipeOperationInterface {
	private static final Logger logger = LogManager.getFormatterLogger("RecipeService");

	@Override
	public List<Recipe> findRecipe(String search_item, String author) {
		List<Recipe> ret;
		RecipeDBService service = new RecipeDBService();
		RecipeDBInterface port = service.getRecipeDBPort();		
		ret = port.getRecipes(search_item, author);
		
		logger.info("Searching for recipe %s", search_item);
		logger.info("Found %d recipe(s)", ret.size());
		logger.debug(ret);
		
		return ret;
	}

	@Override
	public List<Ingredient> findIngredient(String search_term) {
		RetrieveService retrieve_service = new RetrieveService();
		RetrieveInterface port = retrieve_service.getRetrievePort();
		List<Product> products = port.getProducts(search_term);
		List<Ingredient> ret = Mapper.createIngredientList(products);
		
		logger.info("Searching for ingredient %s", search_term);
		logger.info("Found %d recipe(s)", ret.size());
		logger.debug(ret);
		
		return ret;
	}

	@Override
	public Recipe saveRecipe(Recipe recipe) {
		RecipeDBService service = new RecipeDBService();
		RecipeDBInterface port = service.getRecipeDBPort();
		
		logger.info("Saving recipe %s", recipe);
		
		return port.storeRecipe(recipe);
	}

	@Override
	public Recipe createInstantRecipe(String name, Ingredient ingredient) {
		RecipeDBService service = new RecipeDBService();
		RecipeDBInterface port = service.getRecipeDBPort();
		
		logger.info("Saving instant recipe %s using ingredient %s", name, ingredient);
		
		Recipe r = new Recipe();
		r.setName(name);
		
		Recipe ret = port.storeRecipe(r);
		port.addIngredient(r, ingredient);
		
		return ret;
	}

	@Override
	public Recipe updateRecipeIngredients(Recipe r, Ingredient ingr, Double amount) {
		RecipeDBService service = new RecipeDBService();
		RecipeDBInterface port = service.getRecipeDBPort();
	
		logger.info("Updating recipe %s", r);
		
		r = port.getRecipeById(r.getId());
		
		if (amount == null || amount.doubleValue() == 0.0) {
			r = port.removeIngredient(r, ingr);
			logger.info("Removing ingredient ", ingr);
		}
		else if (amount != null){
			ingr = adaptAmount(ingr, amount);
			r = port.addIngredient(r, ingr);
			logger.info("Adding ingredient ", ingr);
		}
		
		return r;
	}
	
	private Ingredient adaptAmount(Ingredient ingr, Double amount){
		double ratio = ingr.getServingSizeQuantity() / amount;
		
		logger.debug("Adapting ingredient %s to amount %f", ingr, amount);
		
		if (ingr.getKcal() != null){
			Double kcal = ingr.getKcal() / ratio;
			ingr.setKcal(kcal);
		}
		
		if (ingr.getServingSizeQuantity() != null){
			Double qnt = ingr.getServingSizeQuantity() / ratio;
			ingr.setServingSizeQuantity(qnt);
		}
		
		if (ingr.getServingWeight() != null){
			int s_weight = (int) Math.round(ingr.getServingWeight() / ratio);
			ingr.setServingWeight(new Integer(s_weight));
		}
		
		logger.debug("Ingredient %s has been adapted.", ingr);
		
		return ingr;
	}
}
