package com.InsuranceProject.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.InsuranceProject.entities.concretes.CarObject;
import com.InsuranceProject.entities.concretes.Cities;
import com.InsuranceProject.entities.concretes.Customer;

public interface CarObjectDao extends JpaRepository<CarObject, Integer> {
	
	//@Query("Select new com.InsuranceProject.entities.dtos.CarObjectWithCitiesDto"+"(p.carId,p.cityName)"+"From Cities c Inner Join c.citySize p")
	//List<CarObjectWithCitiesDto> getCarObjectWithCitiesDetails();


}