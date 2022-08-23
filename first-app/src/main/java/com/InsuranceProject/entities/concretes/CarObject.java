package com.InsuranceProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="traffic_insurance")
public class CarObject {

	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int carId;
	
	@Column(name="city")
	private String city;
	
	@Column(name="car_brand")
	private String carBrand;
	
	@Column(name="car_category")
	private int categoryId;
		
	@Column(name="damage_record")
	private int damageRecord;
	
	@Column(name="insurance_period")
	private int insurancePeriod;
	

	public CarObject() {
		
	}


	public CarObject(int carId, String city, String carBrand, int categoryId, int damageRecord,
			int insurancePeriod) {
		super();
		this.carId = carId;
		this.city = city;
		this.carBrand = carBrand;
		this.categoryId = categoryId;
		this.damageRecord = damageRecord;
		this.insurancePeriod = insurancePeriod;
	}


	public int getCarId() {
		return carId;
	}


	public void setCarId(int carId) {
		this.carId = carId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}


	public int getCategoryId() {
		return categoryId;
	}


	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	public int getDamageRecord() {
		return damageRecord;
	}


	public void setDamageRecord(int damageRecord) {
		this.damageRecord = damageRecord;
	}


	public int getInsurancePeriod() {
		return insurancePeriod;
	}


	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}

}
