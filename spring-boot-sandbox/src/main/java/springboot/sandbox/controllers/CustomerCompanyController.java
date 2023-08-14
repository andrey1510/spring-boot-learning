package springboot.sandbox.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springboot.sandbox.models.Account;
import springboot.sandbox.models.CustomerCompany;
import springboot.sandbox.services.CustomerCompanyService;


@RestController
@RequestMapping("/api/customer-company/")
@RequiredArgsConstructor
public class CustomerCompanyController {

    private final CustomerCompanyService customerCompanyService;

    @PostMapping("create_customer_company")
    public void createCustomerCompany(@RequestBody CustomerCompany customerCompany) {
        customerCompanyService.createCustomerCompany(customerCompany);
    }

    @DeleteMapping("{id}")
    void deleteCustomerCompanyById(@PathVariable("id") Integer id) {
        customerCompanyService.deleteCustomerCompanyById(id);
    }

    @GetMapping("{id}")
    public CustomerCompany getCustomerCompanyById(@PathVariable("id") Integer id) {
        return customerCompanyService.getCustomerCompanyById(id);
    }

    @PutMapping("{id}")
    public void updateTitleById (@PathVariable("id") Integer id, @RequestBody CustomerCompany customerCompany) {
        customerCompanyService.updateTitleById(customerCompany.getTitle(), id);
    }
}
