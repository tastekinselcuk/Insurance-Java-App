package com.InsuranceProject.api.controllers.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceProject.business.abstracts.CitiesService;
import com.InsuranceProject.business.abstracts.CustomerService;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.entities.concretes.Cities;
import com.InsuranceProject.entities.concretes.Customer;

@RestController
@RequestMapping("api/cities")
public class CitiesCont {
	
	private CitiesService citiesService;
	
	@Autowired
	public CitiesCont(CitiesService customerService) {
		super();
		this.citiesService = citiesService;
	}
	
	@GetMapping("/getBycityName")
	public Cities getBycityName(String cityName) {
		return this.citiesService.getBycityName(cityName);
	}

}
