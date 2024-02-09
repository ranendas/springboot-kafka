package com.springbootkafka.service;

import com.springbootkafka.repository.BankRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BankService {

    private BankRepository repository;
}
