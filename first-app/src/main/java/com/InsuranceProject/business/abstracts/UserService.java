package com.InsuranceProject.business.abstracts;

import java.util.List;

import com.InsuranceProject.core.entities.User;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.core.utilities.results.Result;

public interface UserService {
	
	Result add(User user);
	List<User> getAllUsers();
	DataResult<User> findByEmail(String email);

}
