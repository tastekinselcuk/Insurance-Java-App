package com.InsuranceProject.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Products {
	
	@Column(nullable = false)
	public String customerId;
	
	@Column(nullable = false)
	public String City;
	
	
	public Products() {
		
	}
		
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	

}
