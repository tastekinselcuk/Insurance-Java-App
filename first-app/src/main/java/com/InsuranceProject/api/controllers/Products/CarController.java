package com.InsuranceProject.api.controllers.Products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceProject.business.abstracts.Products.CarService;
import com.InsuranceProject.entities.concretes.Products.Car;
import com.InsuranceProject.entities.concretes.Products.Structure;

@RestController
@RequestMapping("api/car")
public class CarController {
	
	@Autowired
	private CarService carService;
	
    @ResponseBody
	@GetMapping("/getAllCar") 
	public List<Car> getAllCar(){
		return this.carService.getAllCar();
	}
    
    @ResponseBody
	@PostMapping("/add") 
	public Car add(Car car){
		return this.carService.saveCar(car);
	}

}
