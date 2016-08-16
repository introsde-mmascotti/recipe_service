
package recipestorage.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the recipestorage.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RemoveIngredientResponse_QNAME = new QName("http://service.recipestorage/", "removeIngredientResponse");
    private final static QName _GetRecipeByIdResponse_QNAME = new QName("http://service.recipestorage/", "getRecipeByIdResponse");
    private final static QName _Recipe_QNAME = new QName("http://service.recipestorage/", "recipe");
    private final static QName _StoreRecipe_QNAME = new QName("http://service.recipestorage/", "storeRecipe");
    private final static QName _GetRecipes_QNAME = new QName("http://service.recipestorage/", "getRecipes");
    private final static QName _AddIngredientResponse_QNAME = new QName("http://service.recipestorage/", "addIngredientResponse");
    private final static QName _GetRecipeById_QNAME = new QName("http://service.recipestorage/", "getRecipeById");
    private final static QName _Ingredient_QNAME = new QName("http://service.recipestorage/", "ingredient");
    private final static QName _RemoveIngredient_QNAME = new QName("http://service.recipestorage/", "removeIngredient");
    private final static QName _StoreRecipeResponse_QNAME = new QName("http://service.recipestorage/", "storeRecipeResponse");
    private final static QName _AddIngredient_QNAME = new QName("http://service.recipestorage/", "addIngredient");
    private final static QName _GetRecipesResponse_QNAME = new QName("http://service.recipestorage/", "getRecipesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: recipestorage.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveIngredient }
     * 
     */
    public RemoveIngredient createRemoveIngredient() {
        return new RemoveIngredient();
    }

    /**
     * Create an instance of {@link StoreRecipeResponse }
     * 
     */
    public StoreRecipeResponse createStoreRecipeResponse() {
        return new StoreRecipeResponse();
    }

    /**
     * Create an instance of {@link AddIngredientResponse }
     * 
     */
    public AddIngredientResponse createAddIngredientResponse() {
        return new AddIngredientResponse();
    }

    /**
     * Create an instance of {@link GetRecipeById }
     * 
     */
    public GetRecipeById createGetRecipeById() {
        return new GetRecipeById();
    }

    /**
     * Create an instance of {@link Ingredient }
     * 
     */
    public Ingredient createIngredient() {
        return new Ingredient();
    }

    /**
     * Create an instance of {@link AddIngredient }
     * 
     */
    public AddIngredient createAddIngredient() {
        return new AddIngredient();
    }

    /**
     * Create an instance of {@link GetRecipesResponse }
     * 
     */
    public GetRecipesResponse createGetRecipesResponse() {
        return new GetRecipesResponse();
    }

    /**
     * Create an instance of {@link Recipe }
     * 
     */
    public Recipe createRecipe() {
        return new Recipe();
    }

    /**
     * Create an instance of {@link StoreRecipe }
     * 
     */
    public StoreRecipe createStoreRecipe() {
        return new StoreRecipe();
    }

    /**
     * Create an instance of {@link RemoveIngredientResponse }
     * 
     */
    public RemoveIngredientResponse createRemoveIngredientResponse() {
        return new RemoveIngredientResponse();
    }

    /**
     * Create an instance of {@link GetRecipeByIdResponse }
     * 
     */
    public GetRecipeByIdResponse createGetRecipeByIdResponse() {
        return new GetRecipeByIdResponse();
    }

    /**
     * Create an instance of {@link GetRecipes }
     * 
     */
    public GetRecipes createGetRecipes() {
        return new GetRecipes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIngredientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "removeIngredientResponse")
    public JAXBElement<RemoveIngredientResponse> createRemoveIngredientResponse(RemoveIngredientResponse value) {
        return new JAXBElement<RemoveIngredientResponse>(_RemoveIngredientResponse_QNAME, RemoveIngredientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "getRecipeByIdResponse")
    public JAXBElement<GetRecipeByIdResponse> createGetRecipeByIdResponse(GetRecipeByIdResponse value) {
        return new JAXBElement<GetRecipeByIdResponse>(_GetRecipeByIdResponse_QNAME, GetRecipeByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Recipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "recipe")
    public JAXBElement<Recipe> createRecipe(Recipe value) {
        return new JAXBElement<Recipe>(_Recipe_QNAME, Recipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreRecipe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "storeRecipe")
    public JAXBElement<StoreRecipe> createStoreRecipe(StoreRecipe value) {
        return new JAXBElement<StoreRecipe>(_StoreRecipe_QNAME, StoreRecipe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "getRecipes")
    public JAXBElement<GetRecipes> createGetRecipes(GetRecipes value) {
        return new JAXBElement<GetRecipes>(_GetRecipes_QNAME, GetRecipes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIngredientResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "addIngredientResponse")
    public JAXBElement<AddIngredientResponse> createAddIngredientResponse(AddIngredientResponse value) {
        return new JAXBElement<AddIngredientResponse>(_AddIngredientResponse_QNAME, AddIngredientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipeById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "getRecipeById")
    public JAXBElement<GetRecipeById> createGetRecipeById(GetRecipeById value) {
        return new JAXBElement<GetRecipeById>(_GetRecipeById_QNAME, GetRecipeById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "ingredient")
    public JAXBElement<Ingredient> createIngredient(Ingredient value) {
        return new JAXBElement<Ingredient>(_Ingredient_QNAME, Ingredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveIngredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "removeIngredient")
    public JAXBElement<RemoveIngredient> createRemoveIngredient(RemoveIngredient value) {
        return new JAXBElement<RemoveIngredient>(_RemoveIngredient_QNAME, RemoveIngredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StoreRecipeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "storeRecipeResponse")
    public JAXBElement<StoreRecipeResponse> createStoreRecipeResponse(StoreRecipeResponse value) {
        return new JAXBElement<StoreRecipeResponse>(_StoreRecipeResponse_QNAME, StoreRecipeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddIngredient }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "addIngredient")
    public JAXBElement<AddIngredient> createAddIngredient(AddIngredient value) {
        return new JAXBElement<AddIngredient>(_AddIngredient_QNAME, AddIngredient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecipesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.recipestorage/", name = "getRecipesResponse")
    public JAXBElement<GetRecipesResponse> createGetRecipesResponse(GetRecipesResponse value) {
        return new JAXBElement<GetRecipesResponse>(_GetRecipesResponse_QNAME, GetRecipesResponse.class, null, value);
    }

}
