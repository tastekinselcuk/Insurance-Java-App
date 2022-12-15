package com.InsuranceProject.business.abstracts;

import com.InsuranceProject.core.entities.User;
import com.InsuranceProject.core.utilities.results.DataResult;
import com.InsuranceProject.core.utilities.results.Result;

public interface UserService {
	
	Result add(User user);
	DataResult<User> findByEmail(String email);

}
