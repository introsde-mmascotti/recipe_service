
package recipestorage.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getRecipeById complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getRecipeById">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipe_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getRecipeById", propOrder = {
    "recipeId"
})
public class GetRecipeById {

    @XmlElement(name = "recipe_id")
    protected int recipeId;

    /**
     * Ruft den Wert der recipeId-Eigenschaft ab.
     * 
     */
    public int getRecipeId() {
        return recipeId;
    }

    /**
     * Legt den Wert der recipeId-Eigenschaft fest.
     * 
     */
    public void setRecipeId(int value) {
        this.recipeId = value;
    }

}
