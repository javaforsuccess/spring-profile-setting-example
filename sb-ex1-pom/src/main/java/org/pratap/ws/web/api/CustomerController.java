package org.pratap.ws.web.api;

import org.pratap.ws.model.Customer;
import org.pratap.ws.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    @PutMapping("/customers/add")
    public Customer addCustomer(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }

}
