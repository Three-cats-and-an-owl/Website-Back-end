package L0.project.products;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Document(collection = "products")
@Data
@NoArgsConstructor
public class Product {

    @Id
    private ObjectId id;
    @Field("product_name")
    private String productName;
    private String productUrl;
    private String productType;
    private List<String> cleanIngredients;
    private String price;
    
    // Constructor
    public Product(ObjectId id, String product_name, String product_url, String product_type, List<String> clean_ingredients, String price){
        this.id = id; //This is the ID value being passed into ProductRepository to locate our product.
        this.productName = product_name;
        this.productUrl = product_url;
        this.productType = product_type;
        this.cleanIngredients = clean_ingredients;
        this.price = price;

    }
}
