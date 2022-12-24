package com.InsuranceProject.business.concretes.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsuranceProject.business.abstracts.Insurances.TrafficInsuranceService;
import com.InsuranceProject.dataAccess.abstracts.Insurances.TrafficInsuranceDao;
import com.InsuranceProject.entities.concretes.Insruances.TrafficInsurance;

@Service
public class TrafficInsuranceManager implements TrafficInsuranceService {

	
	@Autowired
	private TrafficInsuranceDao trafficInsurance;

	@Override
	public List<TrafficInsurance> getAllTrafficInsurance() {
		return this.trafficInsurance.findAll();
	}
}
