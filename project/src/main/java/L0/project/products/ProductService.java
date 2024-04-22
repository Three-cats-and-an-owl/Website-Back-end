package L0.project.products;

import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    //Create
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    //Read
    public List<Product> getProducts() {
        return productRepository.findAll();
    }
    
    public Optional<Product> getProductById(ObjectId id) {
        return productRepository.findById(id);
    }

    public Optional<Product> getProductByName(String product_name) {
        return productRepository.findByProductName(product_name);
    }

    //Update
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    //Delete
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
}
