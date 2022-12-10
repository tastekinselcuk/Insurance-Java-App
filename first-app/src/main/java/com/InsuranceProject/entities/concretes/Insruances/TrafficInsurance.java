package com.InsuranceProject.entities.concretes.Insruances;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.InsuranceProject.entities.abstracts.Insurances;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","CarObject"}) //Bir veriyi birden fazla defa yazdırıp sonsuz döngüye girmesini engellemek için yazıldı.
@Table(name="trafficInsurance")
public class TrafficInsurance extends Insurances {
	
	@Column(name="car_id") //@onetomany ile eklenecek
	public int carId;
	
	@Column(name="car_brand")
	public String carBrand;
	
	@Column(name="car_category")
	public String carCategory;
	
	@Column(name="car_city")
	public String carCity;
	
	@Column(name="damage_record")
	public int carDamagerRecord;
	
	@Column(name="insurance_period")
	public int insurancePeriod;
	
	
	public TrafficInsurance() {
		
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarCategory() {
		return carCategory;
	}

	public void setCarCategory(String carCategory) {
		this.carCategory = carCategory;
	}

	public String getCarCity() {
		return carCity;
	}

	public void setCarCity(String carCity) {
		this.carCity = carCity;
	}

	public int getCarDamagerRecord() {
		return carDamagerRecord;
	}

	public void setCarDamagerRecord(int carDamagerRecord) {
		this.carDamagerRecord = carDamagerRecord;
	}

	public int getInsurancePeriod() {
		return insurancePeriod;
	}

	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}
	



}


//id, ad, soyad, Tarife dönemi, araç Tipi, dönemlere göre hasar kaydı