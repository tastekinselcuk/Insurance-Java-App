package com.InsuranceProject.business.abstracts;

import java.util.List;

import com.InsuranceProject.entities.concretes.CarObject;

public interface CarObjectService {
	
	List<CarObject> getAllCar();
	public CarObject saveCar(CarObject carObject);
	public void deleteCar(int id);
	public int findCityByName(String CityName);


}
