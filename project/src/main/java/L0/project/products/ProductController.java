package L0.project.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;   
    }

    @GetMapping("/{name}")
    public ResponseEntity<Product> getProduct(@PathVariable String product_name) {
        Optional<Product> optionalProduct = productService.getProductByName(product_name);
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();
            return ResponseEntity.ok(product);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
}
    // Endpoints to create, read, update, and delete products...Its our API for products. :D
    // Its important to note that this code is not the same as ProductService. This file
    // is the entry point for our API and will handle HTTP requests and responses. It will call the methods
    // from the ProductService file to perform the CRUD operations.