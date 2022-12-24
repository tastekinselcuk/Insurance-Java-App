package com.InsuranceProject.business.abstracts.Products;

import java.util.List;

import com.InsuranceProject.entities.concretes.Products.Car;
import com.InsuranceProject.entities.concretes.Products.Structure;

public interface CarService {

	
	List<Car> getAllCar();
	public Car saveCar(Car car);
	public void deleteCar(int id);
	Car getBycityName(String cityName);
	
	//Result hesaplamak için yazıldı
	public int findCityByName(String CityName);
}
