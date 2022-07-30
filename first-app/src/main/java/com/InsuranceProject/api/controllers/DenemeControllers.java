package com.InsuranceProject.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class DenemeControllers {

	@RestController
	@RequestMapping
	public class UserApi{
		
		@GetMapping("v1/user/{id}")
		public String getUserById(@PathVariable Long id){
			final String Message = "Hello World"; 
			return Message;
		}
	}
}
