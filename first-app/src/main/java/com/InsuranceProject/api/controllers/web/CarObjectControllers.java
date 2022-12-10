package com.InsuranceProject.api.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.InsuranceProject.business.abstracts.CarObjectService;
import com.InsuranceProject.entities.concretes.Products.Car;

@Controller
public class CarObjectControllers {
	
	@Autowired
	private CarObjectService carObjectService;
	//private CitiesService citiesService;
	//private Customer customer;

	
	
    @PostMapping("/trafficResult")
    public String postTrafficInsurance(@ModelAttribute Car car){
		int rawValue =1200;
		String city = car.getCityName();
		//int idC = customer.getCustomerId();
		Car car2 = carObjectService.getBycityName(city);
		int citySize =carObjectService.findCityByName(city);
		int result = rawValue+(citySize/100)+(rawValue*car.getDamageRecord()/50)-(rawValue*car.getInsurancePeriod()/30);
    	car.setResult(result);
    	car.setCitySize(carObjectService.findCityByName(city));
    	Car addCar= carObjectService.saveCar(car);
    	return "trafficResult";
    }

}