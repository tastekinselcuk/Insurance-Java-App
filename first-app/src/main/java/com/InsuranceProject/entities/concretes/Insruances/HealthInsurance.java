package com.InsuranceProject.entities.concretes.Insruances;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.InsuranceProject.entities.abstracts.Insurances;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","CarObject"}) //Bir veriyi birden fazla defa yazdırıp sonsuz döngüye girmesini engellemek için yazıldı.
@Table(name="healthInsurance")
public class HealthInsurance extends Insurances {
	
	@Column(name ="cutomer_id") //@onetomany ile eklenecek
	public int customerId;

	@Column(name="customer_gender")
	public boolean customerGender;
	
	@Column(name="customer_age")
	public int customerAge;
	
	@Column(name="customer_city")
	public String customerCity;


	
	public HealthInsurance() {
		
	}

	public boolean isCustomerGender() {
		return customerGender;
	}

	public void setCustomerGender(boolean customerGender) {
		this.customerGender = customerGender;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public String getCustomerCity() {
		return customerCity;
	}

	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

}
