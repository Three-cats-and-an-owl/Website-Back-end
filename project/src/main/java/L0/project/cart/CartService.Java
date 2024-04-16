package L0.project.cart;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
impoprt java.util.*;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public List<ObjectId> getProductsByUserId (ObjectId userId) {
        return cartRepository.findByUserId(userId)
            .map(Cart::getProducts)
            .orElseThrow(() -> new IllegalArgumentException("No cart found for this user"));
    
    }
}