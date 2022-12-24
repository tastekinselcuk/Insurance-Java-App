//package com.InsuranceProject.api.controllers.entities;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.InsuranceProject.business.abstracts.CarObjectService;
//import com.InsuranceProject.entities.concretes.Products.Car;
//
//@RestController //@RestController ise @ResponseBody ile kullanılır ve yine sınıfın controller olduğunu belirtir ayrıca dataları doğrudan json ve xml formatında sunmamızı sağlar
////@RequestMapping("api/carObject")
//public class CarObjectCont {
//	
//	private CarObjectService carObjectService;
//
//	@Autowired
//	public CarObjectCont(CarObjectService carObjectService) {
//		super();
//		this.carObjectService = carObjectService;
//	}
//	
////	@GetMapping("/getAllCar") 
////	public List<Car> getAllCar(){
////		return this.carObjectService.getAllCar();
////	}
//	
////	@GetMapping("/getBycityName") 
////	public Car getBycityName(String cityName) {
////		return carObjectService.getBycityName(cityName);
////	}
//	
//	
//	
//}
