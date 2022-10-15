package com.InsuranceProject.api.controllers.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceProject.business.abstracts.CustomerService;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.core.utilities.results.Result;
import com.InsuranceProject.entities.concretes.Customer;

@RestController
@RequestMapping("api/customers")
public class CustomerCont {
	
	private CustomerService customerService;
	
	@Autowired
	public CustomerCont(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}


	@GetMapping("/getall") 
	public DataResult<List<Customer>> getall(){
		return this.customerService.getAllCustomer();
	}
	
	@PostMapping("/add") 
	public Result add(Customer customer){
		return this.customerService.add(customer);
	}
	
	@RequestMapping("/delete") 
	public Result delete(Customer customer){
		return this.customerService.delete(customer);
	}
	
	//Dao'da yazdığım kendi methodlarım
	
	@GetMapping("/getByfirstName")
	public DataResult<List<Customer>> getByfirstName(String firstName){
		return this.customerService.getByfirstName(firstName);
	}
	
	@GetMapping("/getByfirstNameAndCustomerId")
	public DataResult<Customer> getByfirstNameAndCustomerId(String firstName, int customerId){
		return this.customerService.getByfirstNameAndCustomerId(firstName, customerId);
	}
	
	@GetMapping("/getByfirstNameOrCustomerId")
	public DataResult<List<Customer>> getByfirstNameOrCustomerId(String firstName, int customerId){
		return this.customerService.getByfirstNameOrCustomerId(firstName, customerId);
	}
	
	@GetMapping("/getByCustomerIdIn")
	public DataResult<List<Customer>> getByCustomerIdIn(List<Integer> customers){
		return this.customerService.getByCustomerIdIn(customers);
	}
	
	@GetMapping("/getByfirstNameContains")
	public DataResult<List<Customer>> getByfirstNameContains(String firstName){
		return this.customerService.getByfirstNameContains(firstName);
	}
	
	@GetMapping("/getByfirstNameStartsWith")
	public DataResult<List<Customer>> getByfirstNameStartsWith(String firstName){
		return this.customerService.getByfirstNameStartsWith(firstName);
	}
	
	@GetMapping("/getByNameAndId")
	public DataResult<List<Customer>> getByNameAndId(String firstName, int customerId){
		return this.customerService.getByNameAndId(firstName, customerId);
	}

}
