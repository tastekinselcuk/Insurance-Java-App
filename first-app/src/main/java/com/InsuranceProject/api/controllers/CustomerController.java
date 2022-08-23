package com.InsuranceProject.api.controllers;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceProject.business.abstracts.CustomerService;
import com.InsuranceProject.entities.concretes.Customer;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

       
	@PostMapping("/insurances")
	public String PostForm(@ModelAttribute Customer customer) {
		Customer addCustomer = customerService.saveCustomer(customer);
		return "insurances";
	}

}
