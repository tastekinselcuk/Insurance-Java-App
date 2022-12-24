//package com.InsuranceProject.api.controllers.web;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import com.InsuranceProject.business.abstracts.CarObjectService;
//import com.InsuranceProject.entities.concretes.Products.Car;
//
//@Controller //sınıfın controller olduğunu ve http yönlendirmeleri gibi işlemlerin yapılacağını bildirir
//@RequestMapping("apo/carObject")
//public class CarObjectControllers {
//	
//	@Autowired
//	private CarObjectService carObjectService;
//	//private CitiesService citiesService;
//	//private Customer customer;
//
//	
//	
//    public CarObjectControllers(CarObjectService carObjectService) {
//		super();
//		this.carObjectService = carObjectService;
//	}
////
////	@PostMapping("/trafficResult")
////    public String postTrafficInsurance(@ModelAttribute Car car){
////		int rawValue =1200;
////		String city = car.getCityName();
////		//int idC = customer.getCustomerId();
////		Car car2 = carObjectService.getBycityName(city);
////		int citySize =carObjectService.findCityByName(city);
////		int result = rawValue+(citySize/100)+(rawValue*car.getDamageRecord()/50)-(rawValue*car.getInsurancePeriod()/30);
////    	car.setResult(result);
////    	car.setCitySize(carObjectService.findCityByName(city));
////    	Car addCar= carObjectService.saveCar(car);
////    	return "trafficResult";
////    }
//    
//    @ResponseBody
//	@GetMapping("/getAllCar") 
//	public List<Car> getAllCar(){
//		return this.carObjectService.getAllCar();
//	}
//    
//    @ResponseBody
//	@GetMapping("/getBycityName") 
//	public Car getBycityName(String cityName) {
//		return carObjectService.getBycityName(cityName);
//	}
//    
//    @ResponseBody
//	@PostMapping("/add") 
//	public Car add(Car car){
//		return this.carObjectService.saveCar(car);
//	}
//
//}