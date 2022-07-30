package com.InsuranceProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.InsuranceProject.business.abstracts.CarObjectService;
import com.InsuranceProject.entities.abstracts.CarObjectDao;
import com.InsuranceProject.entities.concretes.CarObject;

@Service
public class CarObjectManager implements CarObjectService {
	
	private CarObjectDao carObjectDao;

	@Autowired
	public CarObjectManager(CarObjectDao carObjectDao) {
		super();
		this.carObjectDao = carObjectDao;
	}

	@Override
	public List<CarObject> getAll() {
		return this.carObjectDao.findAll();
	}

}
