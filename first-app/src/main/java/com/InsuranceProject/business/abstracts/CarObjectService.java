package com.InsuranceProject.business.abstracts;

import java.util.List;

import com.InsuranceProject.entities.concretes.CarObject;
import com.InsuranceProject.entities.concretes.Customer;

public interface CarObjectService {
	
	List<CarObject> getAllCar();
	public CarObject saveCar(CarObject carObject);
	public void deleteCar(int id);

}
