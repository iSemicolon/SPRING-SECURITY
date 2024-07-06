package org.kol.customSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansControler {

    @GetMapping("/myLoan")

    public String getLoantDetails() {
        return "Welcome to Loan";
    }
}
