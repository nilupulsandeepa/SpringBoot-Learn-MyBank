package com.mybank.account;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String getMessage() {
        return "Hello From Message";
    }
}
