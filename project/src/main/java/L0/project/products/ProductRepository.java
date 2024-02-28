package L0.project.products;

import java.util.Optional; //This is used for cases when we recieve a null value from the database

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository; //This is the interface that will allow us to use the CRUD operations
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    Optional<Product> findById(ObjectId id); //This is a method that will allow us to find a product by its id
}
