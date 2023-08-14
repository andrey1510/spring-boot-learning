package springboot.sandbox.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "account")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column(name = "status")
    String status;

    @Column(name = "balance", nullable = false)
    Double balance;

    @Column(name = "customer_id", nullable = false)
    Integer customerId;

    @Column(name = "bank_identifier", nullable = false, length = 150)
    String bankIdentifier;
}
