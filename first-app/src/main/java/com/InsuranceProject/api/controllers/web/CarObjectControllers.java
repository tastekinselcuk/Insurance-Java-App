package com.InsuranceProject.api.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.InsuranceProject.business.abstracts.CarObjectService;
import com.InsuranceProject.business.abstracts.CitiesService;
import com.InsuranceProject.entities.concretes.CarObject;

@Controller
public class CarObjectControllers {
	
	@Autowired
	private CarObjectService carObjectService;
	private CitiesService citiesService;
	
	
    @PostMapping("/trafficResult")
    public String postTrafficInsurance(@ModelAttribute CarObject carObject){
		int rawValue =1200;
		String sehir = carObject.getCityName();
		//int result = rawValue+(cityValue*100)+(rawValue*carObject.getDamageRecord()/50)-(rawValue*carObject.getInsurancePeriod()/30);
    	carObject.setResult(rawValue);
    	carObject.setCitySize(carObjectService.findCityByName(sehir));
    	CarObject addCar= carObjectService.saveCar(carObject);
    	return "trafficResult";
    }

}