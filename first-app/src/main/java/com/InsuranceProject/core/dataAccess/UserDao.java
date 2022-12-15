package com.InsuranceProject.core.dataAccess;
import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.core.entities.User;


public interface UserDao extends JpaRepository<User, Integer> {

	User findByEmail(String email);

}
