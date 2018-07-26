package com.konrad.webcustomertracker.controller;

import com.konrad.webcustomertracker.manager.CustomerManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
    CustomerManager customerManager;

    @Autowired
    public CustomerController(CustomerManager customerManager) {
        this.customerManager = customerManager;
    }

    @GetMapping("/")
    public String listClient(Model model) {
        model.addAttribute("customer", customerManager.find(1));
        return "bookList";
    }
}
