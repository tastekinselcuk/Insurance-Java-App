package com.InsuranceProject.business.abstracts;

import java.util.List;

import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.entities.concretes.Cities;

public interface CitiesService {
	
	Cities getByCityName(String cityName);
	//methodda car dan alınan şehir ismiyle şehirdeki eşleşecek
	//sigorta sorgulama bölümünden alınan şehiri parametre olarak vererek şehir tablosundan size verisini çektik

	public int findCityByName(String CityName);
	DataResult<List<Cities>> getAllCities();
	
	List<Cities> getAllCar();


}
