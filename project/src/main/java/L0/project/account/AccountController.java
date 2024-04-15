package L0.project.account;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/api/products")
public class AccountController {

    @Autowired
    private AccountService AccountService;

    @GetMapping
    public List<Account> getAccounts() {
        return AccountService.getAccounts();
    }

    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        return ResponseEntity.ok().body(AccountService.createAccount(account));
    }

    public ResponseEntity<Account> getAccountById(@PathVariable ObjectId id) {
        return AccountService.getAccountById(id)
                .map(account -> ResponseEntity.ok().body(account))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}