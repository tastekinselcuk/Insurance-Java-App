package com.InsuranceProject.business.concretes.Products;

import java.util.List;

import org.springframework.stereotype.Service;

import com.InsuranceProject.business.abstracts.Products.StructureService;
import com.InsuranceProject.dataAccess.abstracts.Products.StructureDao;
import com.InsuranceProject.entities.concretes.Products.Structure;

@Service
public class StructureManager implements StructureService {

	private StructureDao structureDao;
	
	@Override
	public List<Structure> getAllStructure() {
		return this.structureDao.findAll();
	}

	@Override
	public Structure saveStructure(Structure structure) {
		return this.structureDao.save(structure);

	}

	@Override
	public void deleteStructure(int id) {
		this.structureDao.deleteById(id);;
		
	}

}
