package L0.project.account;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService AccountService;

    @GetMapping
    public List<Account> getAccounts() {
        return AccountService.getAccounts();
    }

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        account.setPassword(account.getPassword()); // Password encryption
        return ResponseEntity.ok().body(AccountService.createAccount(account));
    }

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<Account> login(@RequestBody Map<String, String> credentials) {
        String email = credentials.get("email");
        String password = credentials.get("password");

        if (email == null || password == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        Optional<Account> account = AccountService.getAccountByEmail(email);

        if (account.isPresent() && passwordEncoder.matches(password, account.get().getPassword())) {
            return ResponseEntity.ok().body(account.get());
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable ObjectId id) {
        return AccountService.getAccountById(id)
                .map(account -> ResponseEntity.ok().body(account))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/getByEmail{email}")
    public ResponseEntity<Account> getAccountByEmail(@PathVariable String email) {
        return AccountService.getAccountByEmail(email)
                .map(account -> ResponseEntity.ok().body(account))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAccount(@PathVariable String id) {
        AccountService.deleteAccount(id);
        return ResponseEntity.noContent().build();
    }
    @ExceptionHandler
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
    }
}