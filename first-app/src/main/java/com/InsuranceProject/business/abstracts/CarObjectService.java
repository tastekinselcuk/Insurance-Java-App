package com.InsuranceProject.business.abstracts;

import java.util.List;

import com.InsuranceProject.entities.concretes.Cities;
import com.InsuranceProject.entities.concretes.Products.Car;

public interface CarObjectService {
	
	List<Car> getAllCar();
	public Car saveCar(Car car);
	public void deleteCar(int id);
	Car getBycityName(String cityName);
	
	//Result hesaplamak için yazıldı
	public int findCityByName(String CityName);



}
