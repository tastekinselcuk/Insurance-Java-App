package com.InsuranceProject.business.concretes.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsuranceProject.business.abstracts.Insurances.HealthInsuranceService;
import com.InsuranceProject.dataAccess.abstracts.Insurances.HealthInsuranceDao;
import com.InsuranceProject.entities.concretes.Insruances.HealthInsurance;

@Service
public class HealthInsuranceManager implements HealthInsuranceService {
	
	@Autowired
	private HealthInsuranceDao healthInsuranceDao;

	@Override
	public List<HealthInsurance> getAllHealthInsurance() {
		return this.healthInsuranceDao.findAll();
	}

}
