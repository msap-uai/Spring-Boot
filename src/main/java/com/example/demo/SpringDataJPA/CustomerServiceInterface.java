package com.example.demo.SpringDataJPA;

import java.util.List;

public interface CustomerServiceInterface {

    public String loadCustomers ();

    public String addCustomer (Customer customer);

    public List<Customer> showCustomers ();

    public Customer findCustomers (Long id);

    public List<Customer> findCustomersLastName (String lastName);

    public String deleteCustomers(Long id);

    public boolean existCustomer(String lastName);

}
