package com.InsuranceProject.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.InsuranceProject.business.abstracts.CarObjectService;
import com.InsuranceProject.entities.concretes.CarObject;

@Controller
public class CarObjectControllers {
	
	@Autowired
	private CarObjectService carObjectService;
	
	
    @PostMapping("/trafficResult")
    public String postTrafficInsurance(@ModelAttribute CarObject carObject){
    	CarObject addCar= carObjectService.saveCar(carObject);
    	return "trafficResult";
    }

}