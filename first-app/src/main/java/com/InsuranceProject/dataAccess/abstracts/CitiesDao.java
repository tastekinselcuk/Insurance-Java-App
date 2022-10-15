package com.InsuranceProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Cities;

public interface CitiesDao extends JpaRepository<Cities, Integer> {

	Cities getBycityName(String cityName); //list yapılacak
	//sigorta sorgulama bölümünden alınan şehiri parametre olarak vererek şehir tablosundan size verisini çektik

	
	


}
