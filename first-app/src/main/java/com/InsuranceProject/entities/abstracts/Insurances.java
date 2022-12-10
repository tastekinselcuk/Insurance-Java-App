package com.InsuranceProject.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Insurances {

	@Id
	public int insuranceId;
	
	@Column(nullable = false)
	public String insuranceName;
	
	@Column(nullable = false)
	public String Price;
	
	public Insurances() {
		
	}
	
	public int getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		this.Price = price;
	}
}
