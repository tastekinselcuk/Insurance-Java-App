package com.InsuranceProject.entities.concretes.Users;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.InsuranceProject.entities.abstracts.Users;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","CarObject"}) //Bir veriyi birden fazla defa yazdırıp sonsuz döngüye girmesini engellemek için yazıldı.
@Table(name="customer")
public class Customer extends Users {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id")
	private int customerId;	

	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	
//	@OneToMany(mappedBy= "customer")
//	private List<CarObject> carObjects; //müşterilerin araçları - herbir muşteri birden fazla araca sahip olabilir

	public Customer() {
		
	}
	
	public Customer(int customerId, String phoneNumber, String email) {
		super();
		this.customerId = customerId;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}


	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}