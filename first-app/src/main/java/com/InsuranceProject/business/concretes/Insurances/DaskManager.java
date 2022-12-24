package com.InsuranceProject.business.concretes.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsuranceProject.business.abstracts.Insurances.DaskService;
import com.InsuranceProject.dataAccess.abstracts.Insurances.DaskDao;
import com.InsuranceProject.entities.concretes.Insruances.Dask;

@Service
public class DaskManager implements DaskService {

	@Autowired
	private DaskDao daskDao;

	@Override
	public List<Dask> getAllDask() {
		return this.daskDao.findAll();
	}

}
