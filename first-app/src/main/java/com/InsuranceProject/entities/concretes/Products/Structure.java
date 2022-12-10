package com.InsuranceProject.entities.concretes.Products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="structure")
public class Structure {

	@Id
	@Column(name="structure_id")
	public int structureId;	
	
	@Column(name="structure_category")
	public int structureCategory;
	
	@Column(name="construction_date")
	public int constructionDate;
	
	@Column(name="flat_number")
	public int flatNumber;
	
	@Column(name="flat_size")
	public int flatSize;
	
	@Column(name="city")
	public String City;
	
	@Column(name="customer_id") //@onetomany ile eklenecek
	public int customerId;
	
	@Column(name="city_id") //@onetomany ile eklenecek
	public int cityId;
	
	
	public Structure() {
		
	}


	public Structure(int structureId, int structureCategory, int constructionDate, int flatNumber, int flatSize,
			String city, int customerId, int cityId) {
		super();
		this.structureId = structureId;
		this.structureCategory = structureCategory;
		this.constructionDate = constructionDate;
		this.flatNumber = flatNumber;
		this.flatSize = flatSize;
		City = city;
		this.customerId = customerId;
		this.cityId = cityId;
	}


	public int getStructureId() {
		return structureId;
	}


	public void setStructureId(int structureId) {
		this.structureId = structureId;
	}


	public int getStructureCategory() {
		return structureCategory;
	}


	public void setStructureCategory(int structureCategory) {
		this.structureCategory = structureCategory;
	}


	public int getConstructionDate() {
		return constructionDate;
	}


	public void setConstructionDate(int constructionDate) {
		this.constructionDate = constructionDate;
	}


	public int getFlatNumber() {
		return flatNumber;
	}


	public void setFlatNumber(int flatNumber) {
		this.flatNumber = flatNumber;
	}


	public int getFlatSize() {
		return flatSize;
	}


	public void setFlatSize(int flatSize) {
		this.flatSize = flatSize;
	}


	public String getCity() {
		return City;
	}


	public void setCity(String city) {
		City = city;
	}


	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
}
