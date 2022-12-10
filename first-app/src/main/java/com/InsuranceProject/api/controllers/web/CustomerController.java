package com.InsuranceProject.api.controllers.web;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceProject.business.abstracts.CustomerService;
import com.InsuranceProject.entities.concretes.Users.Customer;


@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

       
	@PostMapping("/insurances")
	public String PostForm(@ModelAttribute Customer customer) {
		//kayıt yapılırken formdan alınan şehir id'sini
		Customer addCustomer = customerService.saveCustomer(customer);
		return "insurances";
	}
	
//	@DeleteMapping("/remove/{Id}")
//	public ResponseEntity<Boolean> deleteCustomer(@PathVariable("id") int Id) {
//		Boolean status = customerService.deleteCustomer(Id);
//		return ResponseEntity.ok(status);
//	}
	
}
