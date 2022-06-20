package com.example.demo.SpringDataJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @Autowired
    private CustomerServiceInterface customerService;



    @GetMapping ("/showall")
    public List<Customer> showCustomers (){
        return customerService.showCustomers();
    }

    @GetMapping ("/load")
    public String loadCustomers(){
        customerService.loadCustomers();
        return "Customers added";
    }
    @PostMapping ("/add")
    public String addCustomer(@RequestParam String name,
                              @RequestParam String role){
        Customer newCustomer = new Customer(name,role);
        customerService.addCustomer(newCustomer);
        return "Customer added";

    }

    @GetMapping("/findId")
    public Customer lookCostomer (@RequestParam Long id){
        return customerService.findCustomers(id);
    }

    @GetMapping ("/findName")
    public List<Customer> findCostomerName (@RequestParam String name){
        return customerService.findCustomersLastName(name);
    }

    @DeleteMapping("/delete")
    public String deleteCustomer (@RequestParam Long id){
        return customerService.deleteCustomers(id);
    }


}
