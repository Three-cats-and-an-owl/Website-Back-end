package L0.project.cart;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.*;

public class Cart {
    @Id 
    private ObjectId id;
    private ObjectId userId;
    private List<ObjectId> products;

    public Cart(ObjectId id, ObjectId userId, List<ObjectId> products) {
        this.id = id;
        this.userId = userId;
        this.products = products;
    }

    public ObjectId setUserId (ObjectId userId) {
        return this.userId = userId;
    }
    public ObjectId getUserId() {
        return this.userId;
    }
    //NB: I'm not sure if we need to have a method to set the ID of the cart.
    // The database can handle it automatically but idk

    //I want to use this method for when we display the cart for someone.
    //It'll work by receiving an HTTP request with the userId 
    //of the account in session and return the rendered
    //cards of the objects in their corresponding cart collection.
    }
}
