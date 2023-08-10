package springboot.sandbox.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomerIndividual {

    Integer customerId;
    String identifier;
    String name;
    String surname;

}
