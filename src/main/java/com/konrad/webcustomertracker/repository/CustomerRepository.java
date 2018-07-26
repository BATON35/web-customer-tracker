package com.konrad.webcustomertracker.repository;

import com.konrad.webcustomertracker.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
