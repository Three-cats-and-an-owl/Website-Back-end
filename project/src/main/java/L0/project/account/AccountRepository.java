package L0.project.account;
import java.util.*;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends MongoRepository<Account, String>{
    Optional<Account> findByUserId(ObjectId userId);
}
