package com.mybank.loan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web")
public class WebController {
    @GetMapping("/welcome")
    public String greet(Model model) {
        model.addAttribute("message", "Welcome from Spring Boot");
        return "greetings.html";
    }
}
