package springboot.sandbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springboot.sandbox.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Transactional (readOnly = true)
    @Query(value = "SELECT COUNT(id) FROM account", nativeQuery = true)
    Integer countById();

//    @Transactional
//    @Modifying
//    @Query("update Account a set a.status = :status where a.id = :id")
//    void updateStatusById(String status, Integer id);
//
//    @Transactional
//    @Modifying
//    @Query("update Account a set a.balance = :balance where a.id = :id")
//    void updateBalanceById(Double balance, Integer id);


}
