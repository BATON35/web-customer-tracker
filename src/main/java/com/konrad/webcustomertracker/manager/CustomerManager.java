package com.konrad.webcustomertracker.manager;

import com.konrad.webcustomertracker.entity.Customer;
import com.konrad.webcustomertracker.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerManager {
    @Autowired
    CustomerRepository customerRepository;

    public Customer find(Integer id) {
        return customerRepository.getOne(2);
    }
}
