package springboot.sandbox.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer_company")
public class CustomerCompany extends Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    Integer customerId;

    @Column(name = "identifier", nullable = false, length = 150)
    String identifier;

    @Column(name = "title", nullable = false, length = 150)
    String title;

}
