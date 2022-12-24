package com.InsuranceProject.business.abstracts.Products;

import java.util.List;

import com.InsuranceProject.entities.concretes.Products.Structure;

public interface StructureService {
	
	List<Structure> getAllStructure();
	public Structure saveStructure(Structure structure);
	public void deleteStructure(int id);
	


}
