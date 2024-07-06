package org.kol.customSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/myCard")
    public String getAccountDetails() {
        return "Welcome to Card";
    }
}
