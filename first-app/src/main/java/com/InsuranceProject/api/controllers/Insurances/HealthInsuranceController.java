package com.InsuranceProject.api.controllers.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.InsuranceProject.business.abstracts.Insurances.HealthInsuranceService;
import com.InsuranceProject.entities.concretes.Insruances.HealthInsurance;

@Controller
@RequestMapping("api/healthInsurance")
public class HealthInsuranceController {
	
	@Autowired
	private HealthInsuranceService healthInsuranceService;

    @ResponseBody
	@GetMapping("/getAllHealthInsurance") 
	public List<HealthInsurance> getAllHealthInsurance(){
		return this.healthInsuranceService.getAllHealthInsurance();
    }

}
