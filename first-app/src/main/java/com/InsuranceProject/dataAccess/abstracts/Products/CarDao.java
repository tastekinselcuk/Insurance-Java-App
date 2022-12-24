package com.InsuranceProject.dataAccess.abstracts.Products;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Products.Car;

public interface CarDao extends JpaRepository<Car, Integer> {
	
	public Car getBycityName(String cityName);
}
