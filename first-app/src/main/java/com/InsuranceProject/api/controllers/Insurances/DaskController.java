package com.InsuranceProject.api.controllers.Insurances;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.InsuranceProject.business.abstracts.Insurances.DaskService;
import com.InsuranceProject.entities.concretes.Insruances.Dask;

@Controller
@RequestMapping("api/dask")
public class DaskController {
	
	@Autowired
	private DaskService daskService;

    @ResponseBody
	@GetMapping("/getAllDask") 
	public List<Dask> getAllDask(){
		return this.daskService.getAllDask();
    }

}
