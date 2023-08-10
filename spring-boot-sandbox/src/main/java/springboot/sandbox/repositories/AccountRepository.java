package springboot.sandbox.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AccountRepository {

    @Query(value = "SELECT COUNT(account_id) FROM account", nativeQuery = true)
    Integer countByAccountId();

    @Transactional
    @Modifying
    @Query("update Account a set a.status = :status, where a.accountId = :accountId")
    void updateStatusById(String status, Integer accountId);

    @Transactional
    @Modifying
    @Query("update Account a set a.balance = :balance, where a.accountId = :accountId")
    void updateBalanceById(String balance, Integer accountId);


}
