package com.example.demo.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional // mantiene la info hasta que la puede enviar
public class CustomerServiceImplement implements CustomerServiceInterface{

    @Autowired
    private CustomerRepositoryInterface customerRepository;


    @Override
    public String loadCustomers() {
        customerRepository.save(new Customer("Chloe", "O'Brian"));
        customerRepository.save(new Customer("Kim", "Bauer"));
        customerRepository.save(new Customer("David", "Palmer"));
        customerRepository.save(new Customer("Michelle", "Dessler"));
        return "Customers added";
    }

    @Override
    public String addCustomer(Customer customer) {
        customerRepository.save(customer);
        return "One customer add";
    }

    @Override
    public List<Customer> showCustomers() {
            return (List<Customer>)customerRepository.findAll();
    }

    @Override
    public Customer findCustomers(Long id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public List<Customer> findCustomersLastName(String lastName) {
        return customerRepository.findByLastName(lastName);
    }

    @Override
    public String deleteCustomers(Long id) {
        customerRepository.deleteById(id);
        return "ok";
    }

    @Override
    public boolean existCustomer(String lastName) {
        if (customerRepository.findByLastName(lastName)!= null){
            return true;
        }
        return false;
    }

}
