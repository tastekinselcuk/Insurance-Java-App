package com.InsuranceProject.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import com.InsuranceProject.entities.concretes.Products.Car;

public interface CarObjectDao extends JpaRepository<Car, Integer> {
	
	//@Query("Select new com.InsuranceProject.entities.dtos.CarObjectWithCitiesDto"+"(p.carId,p.cityName)"+"From Cities c Inner Join c.citySize p")
	//List<CarObjectWithCitiesDto> getCarObjectWithCitiesDetails();

	Car getBycityName(String cityName);
	
	//List<CarObject> getByfirstNameOrCustomerId(String firstName, int customerId);



	
//	  @Query("From CarObject where productName=:cityName and Customer.customerId=:customerId")
//	  List<CarObject> getByNameAndCategory(String productName, int categoryId);
//	  
//	  @Query("Select new kodlamaio.northwind.entities.dtos.CarObjectWithCustomerDto"
//	  		+ "(p.id, p.productName, c.categoryName) "
//	  		+ "From Category c Inner Join c.products p")
//	  List<CarObjectWithCustomerDto> getProductWithCategoryDetails();
//	  
//	  //select p.productId,p.productName, c.categoryName  from Category c inner join Product p
//	  //on c.categoryId = p.categoryId
}