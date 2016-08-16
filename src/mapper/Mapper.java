package mapper;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

import recipestorage.service.Ingredient;
import fooddata.adapter.service.Product;

public class Mapper {
	
	static DozerBeanMapper mapper;
	
	static {
		List<String> mappping_files = new ArrayList<String>();
		mappping_files.add("dozer.xml");

		mapper = new DozerBeanMapper();
		mapper.setMappingFiles(mappping_files);
	}
	
	public static Ingredient createIngredient(Product p){
		Ingredient ret = (Ingredient) mapper.map(p, Ingredient.class);
		return ret;
	}
	
	public static List<Ingredient> createIngredientList(List<Product> list){
		List<Ingredient> ret = new ArrayList<Ingredient>(list.size());
		
		for (int i = 0; i < list.size(); i++){
			Product p = list.get(i);
			Ingredient ingr = createIngredient(p);
			ret.add(ingr);
		}
		return ret;
	}
	
}
