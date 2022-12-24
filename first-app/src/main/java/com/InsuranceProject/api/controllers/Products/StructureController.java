package com.InsuranceProject.api.controllers.Products;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.InsuranceProject.business.abstracts.Products.StructureService;
import com.InsuranceProject.core.utilities.results.Result;
import com.InsuranceProject.entities.concretes.Products.Structure;
import com.InsuranceProject.entities.concretes.Users.Customer;

@Controller
@RequestMapping("api/structure")
public class StructureController {

	@Autowired
	private StructureService structureService;
	
    @ResponseBody
	@GetMapping("/getAllStructure") 
	public List<Structure> getAllStructure(){
		return this.structureService.getAllStructure();
	}
    
	@PostMapping("/add") 
	public Structure add(Structure structure){
		return this.structureService.saveStructure(structure);
	}
	
}
