package org.kol.customSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

    @GetMapping("/myContact")
    public String getContatDetails()
    {
            return "Welcome to Contact";
           }
}
