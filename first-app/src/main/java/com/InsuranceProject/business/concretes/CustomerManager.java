package com.InsuranceProject.business.concretes;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.InsuranceProject.business.abstracts.CustomerService;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.core.utilities.results.Result;
import com.InsuranceProject.core.utilities.results.SuccesDataResult;
import com.InsuranceProject.core.utilities.results.SuccessResult;
import com.InsuranceProject.dataAccess.abstracts.Users.CustomerDao;
import com.InsuranceProject.entities.concretes.Users.Customer;

@Service
public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	
	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	
	@Override
	public DataResult<List<Customer>> getAllCustomer() {
		return new SuccesDataResult<List<Customer>>(this.customerDao.findAll(),"Data Listelendi");
				//this.customerDao.findAll();
	}
	
	@Override
	public Customer saveCustomer(Customer customer) {
		return customerDao.save(customer);
	}


//	@Override
//	public Boolean deleteCustomer(int id) {
//		Optional<Customer> customer = customerDao.findById(id);
//		if(customer.isPresent()) {
//			customerDao.deleteById(id);
//			return true;
//		}
//		return null;
//	}

	@Override
	public Result add(Customer customer) {
		this.customerDao.save(customer);
		return new SuccessResult("Ürün Eklendi");
	}

	@Override
	public Result delete(Customer customer) {
		this.customerDao.delete(customer);
		return new SuccessResult("Ürün Silindi");
	}

	@Override
	public DataResult<List<Customer>> getByfirstName(String firstName) {
		return new SuccesDataResult<List<Customer>>(this.customerDao.getByfirstName(firstName),"Data Listelendi");
	}

	@Override
	public DataResult<Customer> getByfirstNameAndCustomerId(String firstName, int customerId) {
		return new SuccesDataResult<Customer>(this.customerDao.getByfirstNameAndCustomerId(firstName, customerId),"Data Listelendi");

	}

	@Override
	public DataResult<List<Customer>> getByfirstNameOrCustomerId(String firstName, int customerId) {
		return new SuccesDataResult<List<Customer>>(this.customerDao.getByfirstNameOrCustomerId(firstName, customerId),"Data Listelendi");

	}

	@Override
	public DataResult<List<Customer>> getByCustomerIdIn(List<Integer> customers) {
		return new SuccesDataResult<List<Customer>>(this.customerDao.getByCustomerIdIn(customers),"Data Listelendi");

	}

	@Override
	public DataResult<List<Customer>> getByfirstNameContains(String firstName) {
		return new SuccesDataResult<List<Customer>>(this.customerDao.getByfirstNameContains(firstName),"Data Listelendi");

	}

	@Override
	public DataResult<List<Customer>> getByfirstNameStartsWith(String firstName) {
		return new SuccesDataResult<List<Customer>>(this.customerDao.getByfirstNameStartsWith(firstName),"Data Listelendi");

	}

	@Override
	public DataResult<List<Customer>> getByNameAndId(String firstName, int customerId) {
		return new SuccesDataResult<List<Customer>>(this.customerDao.getByNameAndId(firstName, customerId),"Data Listelendi");

	}

//	@Override
//	public DataResult<Customer> findTopByOrderByCustomerIdDesc(int customerId) {
//		return new SuccesDataResult<Customer>(this.customerDao.findTopByOrderByCustomerIdDesc(customerId));
//	}



	

}
