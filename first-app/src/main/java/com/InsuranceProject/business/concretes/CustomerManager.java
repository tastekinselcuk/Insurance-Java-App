package com.InsuranceProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.InsuranceProject.business.abstracts.CustomerService;
import com.InsuranceProject.entities.abstracts.CustomerDao;
import com.InsuranceProject.entities.concretes.Customer;

@Service
public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public List<Customer> getAllCustomer() {
		ModelAndView mav = new ModelAndView("list-employees");
		mav.addObject("employees", customerDao.findAll());
		return this.customerDao.findAll();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return customerDao.save(customer);
	}

	@Override
	public void deleteCustomer(int Id) {
		customerDao.deleteById(Id);
	}


	

}
