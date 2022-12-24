package com.InsuranceProject.dataAccess.abstracts.Insurances;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Insruances.TrafficInsurance;

public interface TrafficInsuranceDao extends JpaRepository<TrafficInsurance, Integer> {
	
	

}
