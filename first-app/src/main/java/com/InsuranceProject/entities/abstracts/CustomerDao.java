package com.InsuranceProject.entities.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
