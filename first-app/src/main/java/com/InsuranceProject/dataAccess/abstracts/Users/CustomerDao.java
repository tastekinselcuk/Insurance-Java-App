package com.InsuranceProject.dataAccess.abstracts.Users;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.InsuranceProject.entities.concretes.Users.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

	List<Customer> getByfirstName(String firstName);
	
	Customer getByfirstNameAndCustomerId(String firstName, int customerId);
	//veritabanına yapılan son kaydı döndürür.
	//Customer findTopByOrderByCustomerIdDesc(int customerId);
	
	List<Customer> getByfirstNameOrCustomerId(String firstName, int customerId);
	
	List<Customer> getByCustomerIdIn(List<Integer> customers);
	
	List<Customer> getByfirstNameContains(String firstName);
	
	List<Customer> getByfirstNameStartsWith(String firstName);
	
	@Query("From Customer where firstName=:firstName and customerId=:customerId")
	List<Customer> getByNameAndId(String customer, int customerId);

	
}