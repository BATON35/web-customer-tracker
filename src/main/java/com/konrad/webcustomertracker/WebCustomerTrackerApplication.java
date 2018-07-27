package com.konrad.webcustomertracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.konrad.webcustomertracker")
@EntityScan("com.konrad.webcustomertracker.entity")
@ComponentScan("com.konrad.webcustomertracker")
public class WebCustomerTrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(WebCustomerTrackerApplication.class, args);



	}
}
