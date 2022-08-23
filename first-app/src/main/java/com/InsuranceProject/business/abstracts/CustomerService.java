package com.InsuranceProject.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.core.utilities.results.Result;
import com.InsuranceProject.entities.abstracts.CustomerDao;
import com.InsuranceProject.entities.concretes.CarObject;
import com.InsuranceProject.entities.concretes.Customer;

public interface CustomerService {
	
	List<Customer> getAllCustomer();
	public Customer saveCustomer(Customer customer);
	public void deleteCustomer(int id);

	
}
