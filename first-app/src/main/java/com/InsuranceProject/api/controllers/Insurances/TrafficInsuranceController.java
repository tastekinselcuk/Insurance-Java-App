package com.InsuranceProject.api.controllers.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.InsuranceProject.business.abstracts.Insurances.TrafficInsuranceService;
import com.InsuranceProject.business.abstracts.Products.CarService;
import com.InsuranceProject.entities.concretes.Insruances.TrafficInsurance;
import com.InsuranceProject.entities.concretes.Products.Car;

@Controller
@RequestMapping("api/TrafficInsurance")
public class TrafficInsuranceController {
	
	@Autowired
	private TrafficInsuranceService trafficInsuranceService;
	private CarService carService;

    @ResponseBody
	@GetMapping("/getAllTrafficInsurance") 
	public List<TrafficInsurance> getAllCar(){
		return this.trafficInsuranceService.getAllTrafficInsurance();
    }
    
	@PostMapping("/trafficResult")
    public String postTrafficInsurance(@ModelAttribute Car car){
		int rawValue =1200;
		String city = car.getCityName();
		//int idC = customer.getCustomerId();
		Car car2 = carService.getBycityName(city);
		int citySize =carService.findCityByName(city);
		int result = rawValue+(citySize/100)+(rawValue*car.getDamageRecord()/50)-(rawValue*car.getInsurancePeriod()/30);
    	car.setResult(result);
    	car.setCitySize(carService.findCityByName(city));
    	Car addCar= carService.saveCar(car);
    	return "trafficResult";
    }
    

}
