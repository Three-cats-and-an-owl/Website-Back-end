package L0.project.products;

import java.util.List;
import java.util.Optional;
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
    
    public Optional<Product> getProductById(String id) {
        return productRepository.findById(id);
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
