package springboot.sandbox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.sandbox.models.Account;
import springboot.sandbox.repositories.AccountRepository;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    @Transactional
    public Account createAccount(Account account) {
        return accountRepository.save(account);
    }

    @Override
    @Transactional
    public void deleteAccountById(Integer id) {
        accountRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Account getAccountById(Integer id) {
        return accountRepository.findById(id).orElse(null);
    }


//    @Override
//    @Transactional
//    public void updateBalanceById(Double balance, Integer id) {
//        accountRepository.updateBalanceById(balance, id);
//    }
//
//    @Override
//    @Transactional
//    public void updateStatusById(String status, Integer id) {
//        accountRepository.updateStatusById(status, id);
//    }

    @Override
    public Integer countById(){
        return accountRepository.countById();
    }


}
