package springboot.sandbox.controllers;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springboot.sandbox.models.Account;
import springboot.sandbox.services.AccountService;

@RestController
@RequestMapping("/api/account/")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("create_account")
    public ResponseEntity<Account> createAccount(@RequestBody Account account) {
        accountService.createAccount(account);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    void deleteAccountById(@PathVariable("id") Integer id) {
        accountService.deleteAccountById(id);
    }
//
//    @PutMapping("{id}")
//    public void updateBalanceById (@PathVariable("id") Integer id, @RequestBody Account account) {
//        accountService.updateBalanceById(account.getBalance(), id);
//    }
//
//    @PutMapping("{id}")
//    public void updateStatusById (@PathVariable("id") Integer id, @RequestBody Account account) {
//        accountService.updateStatusById(account.getStatus(), id);
//    }

    @GetMapping("count_accounts")
    public Integer countByAccountId(){
        return accountService.countById();
    }

    @GetMapping("{id}")
    public Account getAccountById(@PathVariable("id") Integer id) {
        return accountService.getAccountById(id);
    }

}
