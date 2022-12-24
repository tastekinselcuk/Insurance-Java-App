package com.InsuranceProject.dataAccess.abstracts.Insurances;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Insruances.Dask;

public interface DaskDao extends JpaRepository<Dask, Integer> {
	
	

}
