package com.InsuranceProject.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.InsuranceProject.business.abstracts.CarObjectService;
import com.InsuranceProject.entities.abstracts.CarObjectDao;
import com.InsuranceProject.entities.concretes.CarObject;

@Service
public class CarObjectManager implements CarObjectService {
	
	private CarObjectDao carObjectDao;

	@Autowired
	public CarObjectManager(CarObjectDao carObjectDao) {
		this.carObjectDao = carObjectDao;
	}


	@Override
	public List<CarObject> getAllCar() {
		ModelAndView mav = new ModelAndView("list-cars");
		mav.addObject("cars", carObjectDao.findAll());
		return this.carObjectDao.findAll();
	}

	@Override
	public CarObject saveCar(CarObject carObject) {
		return carObjectDao.save(carObject);
	}

	@Override
	public void deleteCar(int id) {
		carObjectDao.deleteById(id);
		
	}



}
