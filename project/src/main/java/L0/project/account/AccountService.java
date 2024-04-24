package L0.project.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.bson.types.ObjectId;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public Account createAccount(Account account) {
        account.setPassword(bCryptPasswordEncoder.encode(account.getPassword()));
        return accountRepository.save(account);
    }

    public Account getAccount(ObjectId userId) {
        return accountRepository.findByUserId(userId).orElse(null);
    }

    public Account updateAccount(ObjectId userId, Account accountDetails) {
        Account account = getAccount(userId);
        if(account != null) {
            account.setUsername(accountDetails.getUsername());
            account.setPassword(bCryptPasswordEncoder.encode(accountDetails.getPassword()));
            account.setEmail(accountDetails.getEmail());
            account.setAddress(accountDetails.getAddress());
            account.setPhone(accountDetails.getPhone());
            account.setRole(accountDetails.getRole());
            accountRepository.save(account);
        }
        return account;
    }

    public void deleteAccount(ObjectId userId) {
        accountRepository.deleteById(userId.toString());
    }
}
