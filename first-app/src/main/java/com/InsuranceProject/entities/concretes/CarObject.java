package com.InsuranceProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="cars_properties")
public class CarObject {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="car_id")
	private String carId;
	
	@Column(name="Brand")
	private String carBrand;
	
	@Column(name="insurance_period")
	private int insurancePeriod;
	
	@Column(name="Model")
	private int model;
	
	@Column(name="cadegory_name")
	private int cadegoryName;
	
	@Column(name="cadegory_id")
	private int cadegoryId;
	
	@Column(name="damage_record")
	private int damageRecord;

	public CarObject() {
		
	}
	public CarObject(int id, String carId, String carBrand, int insurancePeriod, int model, int cadegoryName,
			int cadegoryId, int damageRecord) {
		super();
		this.id = id;
		this.carId = carId;
		this.carBrand = carBrand;
		this.insurancePeriod = insurancePeriod;
		this.model = model;
		this.cadegoryName = cadegoryName;
		this.cadegoryId = cadegoryId;
		this.damageRecord = damageRecord;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCarId() {
		return carId;
	}


	public void setCarId(String carId) {
		this.carId = carId;
	}


	public String getCarBrand() {
		return carBrand;
	}


	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}


	public int getInsurancePeriod() {
		return insurancePeriod;
	}


	public void setInsurancePeriod(int insurancePeriod) {
		this.insurancePeriod = insurancePeriod;
	}


	public int getModel() {
		return model;
	}


	public void setModel(int model) {
		this.model = model;
	}


	public int getCadegoryName() {
		return cadegoryName;
	}


	public void setCadegoryName(int cadegoryName) {
		this.cadegoryName = cadegoryName;
	}


	public int getCadegoryId() {
		return cadegoryId;
	}


	public void setCadegoryId(int cadegoryId) {
		this.cadegoryId = cadegoryId;
	}


	public int getDamageRecord() {
		return damageRecord;
	}


	public void setDamageRecord(int damageRecord) {
		this.damageRecord = damageRecord;
	}
}
