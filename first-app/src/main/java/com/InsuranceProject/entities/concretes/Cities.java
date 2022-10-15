package com.InsuranceProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="cities")
public class Cities {

	@Id
	@Column(name="city_id")
	private int cityId;

	@Column(name="city_name")
	private int cityName;
	
	@Column(name="city_size")
	private int citySize;

	public Cities() {
		
	}

	public Cities(int cityId, int cityName, int citySize) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.citySize = citySize;
	}
	
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public int getCityName() {
		return cityName;
	}

	public void setCityName(int cityName) {
		this.cityName = cityName;
	}

	public int getCitySize() {
		return citySize;
	}

	public void setCitySize(int citySize) {
		this.citySize = citySize;
	}
	
}
