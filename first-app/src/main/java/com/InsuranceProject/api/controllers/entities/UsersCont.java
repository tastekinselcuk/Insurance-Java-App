package com.InsuranceProject.api.controllers.entities;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.InsuranceProject.business.abstracts.UserService;
import com.InsuranceProject.core.entities.User;
import com.InsuranceProject.core.utilities.results.ErrorDataResult;
import com.InsuranceProject.entities.concretes.Products.Car;

import org.springframework.validation.FieldError;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping(value="/api/users")
public class UsersCont {
	
	private UserService userService;
	
	@Autowired
	public UsersCont(UserService userService) {
		super();
		this.userService = userService;
	}

	@GetMapping("/getAllUsers") 
	public List<User> getAllCar(){
		return this.userService.getAllUsers();
	}
	
	@PostMapping(value="/add")
	public ResponseEntity<?> add(@Valid @RequestBody User user) {
		
		return ResponseEntity.ok(this.userService.add(user)) ;
	}
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException
	(MethodArgumentNotValidException exceptions){
		Map<String,String> validationErrors = new HashMap<String, String>();
		for(FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		
		ErrorDataResult<Object> errors 
		= new ErrorDataResult<Object>(validationErrors,"Doğrulama hataları");
		return errors;
	}

}
