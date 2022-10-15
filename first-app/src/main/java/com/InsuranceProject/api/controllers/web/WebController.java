package com.InsuranceProject.api.controllers.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.InsuranceProject.entities.concretes.Customer;

@Controller
public class WebController {
	


	//Sayfa Linkleri

	@GetMapping("/index")
	public String GetForm() {
		return "index";
	}
	
    @GetMapping("/urunlerimiz")
    public String getProducts(){
    	return "urunlerimiz";
    }
    
    @GetMapping("/hakkımızda")
    public String getAbout(){
    	return "hakkımızda";
    }
    
    @GetMapping("/iletisim")
    public String getContact(){
    	return "iletisim";
    }
    
    @GetMapping("/trafficInsurance")
    public String getTraffic(){
    	return "trafficInsurance";
    }
    
    @GetMapping("/insurances")
	public String PostInsurances() {
    	return "insurances";
    }
    
    @GetMapping("/profile")
	public String PostProfile() {
    	return "profile";
    }
    
    @GetMapping("/trafficResult")
	public String PostTrafficResult() {
    	return "trafficResult";
    }
    
	@GetMapping("/progress")
	public String GetProgres() {
		return "progress";
	}
    
	@GetMapping("/unauthorized")
	public String GetError() {
		return "unauthorized";
	}
    
}
