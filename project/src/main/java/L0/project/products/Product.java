package L0.project.products;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Document(collection = "products")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Id
    private ObjectId id;
    private String name;
    private String description;
    private String category;
    private String price;
    private String image;
    private List<String> tags;
    private List<String> colors;
    private List<String> sizes;
    private List<String> images;
    private List<String> reviews;
    
    // Constructor
    public Product(ObjectId id, String name, String description, String category, String price, String image, List<String> tags, 
    List<String> colors, List<String> sizes, List<String> images, List<String> reviews) {
        this.id = id; //This is the ID value being passed into ProductRepository to locate our product.
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.image = image;
        this.tags = tags;
        this.colors = colors;
        this.sizes = sizes;
        this.images = images;
        this.reviews = reviews;
    }
}
