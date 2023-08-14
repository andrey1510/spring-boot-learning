package springboot.sandbox.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.sandbox.models.CustomerCompany;
import springboot.sandbox.repositories.CustomerCompanyRepository;

@Service
public class CustomerCompanyServiceImpl implements CustomerCompanyService {

    @Autowired
    private CustomerCompanyRepository customerCompanyRepository;

    @Override
    @Transactional
    public CustomerCompany createCustomerCompany(CustomerCompany customerCompany) {
        return customerCompanyRepository.save(customerCompany);
    }

    @Override
    @Transactional
    public void deleteCustomerCompanyById(Integer id) {
        customerCompanyRepository.deleteById(id);
    }

    @Override
    @Transactional
    public CustomerCompany getCustomerCompanyById(Integer id) {
        return customerCompanyRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void updateTitleById(String title, Integer id) {
        customerCompanyRepository.updateTitleById(title, id);
    }

}
