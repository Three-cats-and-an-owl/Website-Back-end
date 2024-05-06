package L0.project.products;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getProducts(int page, int limit) {
        Pageable pageable = PageRequest.of(page, limit);
        return productRepository.findAll(pageable);
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

    public List<Product> getProductByName(String productName) {
        return productRepository.findByProductNameContainingIgnoreCase(productName);
    }

    //Update
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    //Delete
    public void deleteProduct(String id) {
        productRepository.deleteById(id);
    }
    public List<Product> getProducts(int limit) {
        return productRepository.findAll().stream().limit(limit).collect(Collectors.toList());
    }
}
