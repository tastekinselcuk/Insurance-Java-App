package com.InsuranceProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="car_categories")
public class CarCategories {

	@Id
	@Column(name="car_category_id")
	private int categoryId;
	
	@Column(name="category_name")
	private String categoryName;
	
	@Column(name="category_coefficient")
	private String categoryCoefficient;

	public CarCategories() {
		
	}

	public CarCategories(int categoryId, String categoryName, String categoryCoefficient) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.categoryCoefficient = categoryCoefficient;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryCoefficient() {
		return categoryCoefficient;
	}

	public void setCategoryCoefficient(String categoryCoefficient) {
		this.categoryCoefficient = categoryCoefficient;
	}
	
}