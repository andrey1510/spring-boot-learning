package springboot.sandbox.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import springboot.sandbox.models.CustomerCompany;

@Repository
public interface CustomerCompanyRepository extends JpaRepository<CustomerCompany, Integer> {

    @Transactional
    @Modifying
    @Query("update CustomerCompany c set c.title = :title where c.id = :id")
    void updateTitleById(String title, Integer id);

}
