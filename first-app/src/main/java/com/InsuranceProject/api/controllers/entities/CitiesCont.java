package com.InsuranceProject.api.controllers.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.InsuranceProject.business.abstracts.CitiesService;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.entities.concretes.Cities;
import com.InsuranceProject.entities.concretes.Users.Customer;

@RestController
@RequestMapping("api/cities")
public class CitiesCont {
	
	private CitiesService citiesService;
	
	@Autowired
	public CitiesCont(CitiesService citiesService) {
		super();
		this.citiesService = citiesService;
	}
	
	@GetMapping("/getBycityName")
	public Cities getBycityName(String cityName) {
		return citiesService.getByCityName(cityName);
	}
	
	@GetMapping("/getAllCities") 
	public DataResult<List<Cities>> getall(){
		return citiesService.getAllCities();
	}

}
