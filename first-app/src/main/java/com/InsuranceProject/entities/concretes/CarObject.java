package com.InsuranceProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="cars")
public class CarObject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="car_id")
	private int carId;	
	
	@Column(name="city_name")
	private String cityName;
	
	@Column(name="city_size")
	private long citySize;
	
	@Column(name="car_brand")
	private String carBrand;
	
	@Column(name="category_name")
	private String categoryName;
		
	@Column(name="damage_record")
	private int damageRecord;
	
	@Column(name="insurance_period")
	private int insurancePeriod;
	
	@Column(name="result")
	private int result;
	
	@ManyToOne()
	@JoinColumn(name="customer_id")
	private Customer customer; //her bir aracın bir müşterisi olur 
	

	public CarObject() {
		
	}




	
	public CarObject(int carId, String cityName, long citySize, String carBrand, String categoryName,
			int damageRecord, int insurancePeriod, int result, Customer customer) {
		super();
		this.carId = carId;
		this.cityName = cityName;
		this.citySize = citySize;
		this.carBrand = carBrand;
		this.categoryName = categoryName;
		this.damageRecord = damageRecord;
		this.insurancePeriod = insurancePeriod;
		this.result = result;
		this.customer = customer;
	}





	public int getCarId() {
		return carId;
	}





	public void setCarId(int carId) {
		this.carId = carId;
	}





	public String getCityName() {
		return cityName;
	}





	public void setCityName(String cityName) {
		this.cityName = cityName;
	}





	public long getCitySize() {
		return citySize;
	}





	public void setCitySize(long citySize) {
		this.citySize = citySize;
	}





	public String getCarBrand() {
		return carBrand;
	}





	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}





	public String getCategoryName() {
		return categoryName;
	}





	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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





	public int getResult() {
		return result;
	}





	public void setResult(int result) {
		this.result = result;
	}





	public Customer getCustomer() {
		return customer;
	}





	public void setCustomer(Customer customer) {
		this.customer = customer;
	}





	
}
