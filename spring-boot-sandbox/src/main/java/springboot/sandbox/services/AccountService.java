package springboot.sandbox.services;

import springboot.sandbox.models.Account;

public interface AccountService {

    Account createAccount(Account account);

    void deleteAccountById(Integer id);

//    void updateBalanceById(Double balance, Integer aid);
//
//    void updateStatusById(String status, Integer id);

    Account getAccountById(Integer id);

    Integer countById();

}

