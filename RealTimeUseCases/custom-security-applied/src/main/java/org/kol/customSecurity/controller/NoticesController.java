package org.kol.customSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {

    @GetMapping("/myNotice")

    public String getNoticeDetails()
    {
        return "Welcome to Notice";
    }
}
