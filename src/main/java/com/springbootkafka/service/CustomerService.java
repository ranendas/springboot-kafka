package com.springbootkafka.service;

import com.springbootkafka.entity.Customer;
import com.springbootkafka.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private CustomerRepository repository;

    public Customer addCustomer(Customer customer){
        return repository.save(customer);
    }
}
