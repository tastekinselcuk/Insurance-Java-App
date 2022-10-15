package com.InsuranceProject.business.abstracts;

import com.InsuranceProject.entities.concretes.Cities;

public interface CitiesService {
	
	public Cities getBycityName(String cityName);
	//methodda car dan alınan şehir ismiyle şehirdeki eşleşecek
	//sigorta sorgulama bölümünden alınan şehiri parametre olarak vererek şehir tablosundan size verisini çektik

	public int findCityByName(String CityName);

}
