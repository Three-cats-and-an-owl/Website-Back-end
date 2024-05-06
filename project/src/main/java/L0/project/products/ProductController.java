package L0.project.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
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
    @GetMapping
    public List<Product> getProducts(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "50") int limit) {
        Page<Product> productPage = productService.getProducts(page, limit);
        return productPage.getContent();
    }
    @GetMapping("/{name}")
    public ResponseEntity<List<Product>> getProducts(@PathVariable String name) {
        List<Product> products = productService.getProductByName(name);
        if (!products.isEmpty()) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}