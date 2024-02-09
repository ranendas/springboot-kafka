package com.springbootkafka.service;

import com.springbootkafka.entity.Bank;
import com.springbootkafka.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BankService {

    private BankRepository repository;

    public Bank addBank(Bank bank){
        return repository.save(bank);
    }
}
