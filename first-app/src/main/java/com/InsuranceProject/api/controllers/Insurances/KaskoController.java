package com.InsuranceProject.api.controllers.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.InsuranceProject.business.abstracts.Insurances.KaskoService;
import com.InsuranceProject.entities.concretes.Insruances.Kasko;

@Controller
@RequestMapping("api/kaskoController")
public class KaskoController {
	
	@Autowired
	private KaskoService kaskoService;

    @ResponseBody
	@GetMapping("/getAllKasko") 
	public List<Kasko> getAllKasko(){
		return this.kaskoService.getAllKasko();
    }

}
