package com.springbootkafka.controller;

import com.springbootkafka.entity.Customer;
import com.springbootkafka.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService service;

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        Customer customer1 = service.addCustomer(customer);
        log.info("New Customer {} ", customer1);
        return customer1;
    }
}
