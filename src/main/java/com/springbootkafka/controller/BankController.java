package com.springbootkafka.controller;

import com.springbootkafka.entity.Bank;
import com.springbootkafka.service.BankService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
@AllArgsConstructor
@Slf4j
public class BankController {

    private BankService service;

    @PostMapping
    public Bank addBankDetails(@RequestBody Bank bank){
        Bank bank1 = service.addBank(bank);
        log.info("New Bank data created {} " , bank1);
        return bank1;
    }
}
