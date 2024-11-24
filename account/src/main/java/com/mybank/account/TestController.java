package com.mybank.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String hello() {
        return messageService.getMessage();
    }
}
