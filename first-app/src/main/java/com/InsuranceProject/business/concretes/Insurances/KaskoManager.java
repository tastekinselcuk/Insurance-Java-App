package com.InsuranceProject.business.concretes.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsuranceProject.business.abstracts.Insurances.KaskoService;
import com.InsuranceProject.dataAccess.abstracts.Insurances.KaskoDao;
import com.InsuranceProject.entities.concretes.Insruances.Kasko;

@Service
public class KaskoManager implements KaskoService {
	
	@Autowired
	private KaskoDao kaskoDao;

	@Override
	public List<Kasko> getAllKasko() {
		return this.kaskoDao.findAll();
	}

}
