//package com.InsuranceProject.entities.concretes.Products;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//
//import com.InsuranceProject.entities.concretes.Users.Customer;
//
//
//@Entity
//@Table(name="cars")
//public class CarObject {
//	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="car_id")
//	private int carId;	
//	
//	@Column(name="car_brand")
//	private String carBrand;
//	
//	@Column(name="car_category")
//	private String carCategory;
//		
//	@Column(name="damage_record")
//	private int damageRecord;
//	
//	@Column(name="insurance_period")
//	private int insurancePeriod;
//	
//	@Column(name="customer_id") //@onetomany ile eklenecek
//	public int customerId;
//	
//	@Column(name="city_id") //@onetomany ile eklenecek
//	public int cityId;
//	
//	//burdan sonrası silinip CarObjectControllers düzenlenecek
//	@Column(name="city_name")
//	private String cityName;
//	
//	@Column(name="city_size")
//	private long citySize;
//	
//	@Column(name="category_name")
//	private String categoryName;
//	
//	@Column(name="result")
//	private int result;
//	
////	@ManyToOne()
////	@JoinColumn(name="kimlik_no")
////	private Customer customer; //her bir aracın bir müşterisi olur 
//	
//
//	public CarObject() {
//		
//	}
//
//public CarObject(int carId, String carBrand, String carCategory, int damageRecord, int insurancePeriod, int customerId,
//		int cityId, String cityName, long citySize, String categoryName, int result) {
//	super();
//	this.carId = carId;
//	this.carBrand = carBrand;
//	this.carCategory = carCategory;
//	this.damageRecord = damageRecord;
//	this.insurancePeriod = insurancePeriod;
//	this.customerId = customerId;
//	this.cityId = cityId;
//	this.cityName = cityName;
//	this.citySize = citySize;
//	this.categoryName = categoryName;
//	this.result = result;
//}
//
//public int getCarId() {
//	return carId;
//}
//
//public void setCarId(int carId) {
//	this.carId = carId;
//}
//
//public String getCarBrand() {
//	return carBrand;
//}
//
//public void setCarBrand(String carBrand) {
//	this.carBrand = carBrand;
//}
//
//public String getCarCategory() {
//	return carCategory;
//}
//
//public void setCarCategory(String carCategory) {
//	this.carCategory = carCategory;
//}
//
//public int getDamageRecord() {
//	return damageRecord;
//}
//
//public void setDamageRecord(int damageRecord) {
//	this.damageRecord = damageRecord;
//}
//
//public int getInsurancePeriod() {
//	return insurancePeriod;
//}
//
//public void setInsurancePeriod(int insurancePeriod) {
//	this.insurancePeriod = insurancePeriod;
//}
//
//public int getCustomerId() {
//	return customerId;
//}
//
//public void setCustomerId(int customerId) {
//	this.customerId = customerId;
//}
//
//public int getCityId() {
//	return cityId;
//}
//
//public void setCityId(int cityId) {
//	this.cityId = cityId;
//}
//
//public String getCityName() {
//	return cityName;
//}
//
//public void setCityName(String cityName) {
//	this.cityName = cityName;
//}
//
//public long getCitySize() {
//	return citySize;
//}
//
//public void setCitySize(long citySize) {
//	this.citySize = citySize;
//}
//
//public String getCategoryName() {
//	return categoryName;
//}
//
//public void setCategoryName(String categoryName) {
//	this.categoryName = categoryName;
//}
//
//public int getResult() {
//	return result;
//}
//
//public void setResult(int result) {
//	this.result = result;
//}
//
//
//	
//}