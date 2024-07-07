package org.kol.customSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansControler {

    @GetMapping("/myLoans")
    public String getLoanDetails() {
        return "Here are the loan details from the DB";
    }
}