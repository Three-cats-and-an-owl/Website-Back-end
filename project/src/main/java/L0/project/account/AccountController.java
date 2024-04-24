package L0.project.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.bson.types.ObjectId;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountService.createAccount(account);
    }

    @GetMapping("/{userId}")
    public Account getAccount(@PathVariable ObjectId userId) {
        return accountService.getAccount(userId);
    }

    @PutMapping("/{userId}")
    public Account updateAccount(@PathVariable ObjectId userId, @RequestBody Account accountDetails) {
        return accountService.updateAccount(userId, accountDetails);
    }

    @DeleteMapping("/{userId}")
    public void deleteAccount(@PathVariable ObjectId userId) {
        accountService.deleteAccount(userId);
    }
}