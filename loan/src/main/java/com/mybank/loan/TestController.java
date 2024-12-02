package com.mybank.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class TestController {
    @GetMapping("loantest")
    public String loanTest() {
        return "Loan Test";
    }
}
