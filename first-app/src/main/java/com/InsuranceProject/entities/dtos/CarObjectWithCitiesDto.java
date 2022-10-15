package com.InsuranceProject.entities.dtos;


public class CarObjectWithCitiesDto {

	private int id;
	private String cityName;
	private String citySize;
	
	
	public CarObjectWithCitiesDto() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CarObjectWithCitiesDto(int id, String cityName, String citySize) {
		super();
		this.id = id;
		this.cityName = cityName;
		this.citySize = citySize;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getCitySize() {
		return citySize;
	}


	public void setCitySize(String citySize) {
		this.citySize = citySize;
	}
}
