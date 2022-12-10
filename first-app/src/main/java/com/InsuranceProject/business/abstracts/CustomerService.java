package com.InsuranceProject.business.abstracts;

import java.util.List;

import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.core.utilities.results.Result;
import com.InsuranceProject.entities.concretes.Users.Customer;

public interface CustomerService {
	
	public Customer saveCustomer(Customer customer);
//	public void deleteCustomer(int id);
	
	DataResult<List<Customer>> getAllCustomer();
	
	Result add(Customer customer);
	
	Result delete(Customer customer);

	//Dao'da yazdığım kendi methodlarım
	DataResult<List<Customer>> getByfirstName(String firstName);
	
	DataResult<Customer> getByfirstNameAndCustomerId(String firstName, int customerId);
	
	//DataResult<Customer> findTopByOrderByCustomerIdDesc(int customerId);
	
	DataResult<List<Customer>> getByfirstNameOrCustomerId(String firstName, int customerId);
	
	DataResult<List<Customer>> getByCustomerIdIn(List<Integer> customers);
	
	DataResult<List<Customer>> getByfirstNameContains(String firstName);
	
	DataResult<List<Customer>> getByfirstNameStartsWith(String firstName);
	
	DataResult<List<Customer>> getByNameAndId(String firstName, int customerId);

	
}
