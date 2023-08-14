package springboot.sandbox.services;


import springboot.sandbox.models.CustomerCompany;

public interface CustomerCompanyService {

    CustomerCompany createCustomerCompany(CustomerCompany customerCompany);

    void deleteCustomerCompanyById(Integer id);

    CustomerCompany getCustomerCompanyById(Integer id);

    void updateTitleById(String title, Integer id);
}

