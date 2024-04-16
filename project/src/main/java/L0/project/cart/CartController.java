package L0.project.cart;

import org.bson.types.ObjectId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cart")
public class CartController {
    
    @Autowired
    private CartService cartService;

    @GetMapping("/{userId}")
    public List<ObjectId> getProductsByUserId(@PathVariable ObjectId userId) {
        return cartService.getProductsByUserId(userId);
    }
}
