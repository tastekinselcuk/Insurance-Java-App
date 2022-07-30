package com.InsuranceProject.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceProject.business.abstracts.CarObjectService;
import com.InsuranceProject.entities.concretes.CarObject;

@RestController
@RequestMapping("/api/CarObject")
public class CarObjectControllers {
	
	private CarObjectService carObjectService;
	
	@GetMapping("/getall")
	public List<CarObject> getAll(){
		return this.carObjectService.getAll();
	}
}
