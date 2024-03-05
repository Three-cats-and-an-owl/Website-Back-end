package L0.project.products;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // Endpoints to create, read, update, and delete products...Its our API for products. :D
    // Its important to note that this code is not the same as ProductService. This file
    // is the entry point for our API and will handle HTTP requests and responses. It will call the methods
    // from the ProductService file to perform the CRUD operations.
}