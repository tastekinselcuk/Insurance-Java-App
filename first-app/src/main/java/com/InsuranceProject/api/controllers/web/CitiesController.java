package com.InsuranceProject.api.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.InsuranceProject.business.abstracts.CitiesService;

@Controller
public class CitiesController {
	
	@Autowired
	private CitiesService citiesService;
	

}
