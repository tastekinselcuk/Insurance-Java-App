package com.InsuranceProject.dataAccess.abstracts.Insurances;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Insruances.Kasko;


public interface KaskoDao extends JpaRepository<Kasko, Integer> {
	
	

}