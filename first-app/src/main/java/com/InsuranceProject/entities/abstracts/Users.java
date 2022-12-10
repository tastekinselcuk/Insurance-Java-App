package com.InsuranceProject.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Users {
	
	@Column(nullable = false)
	public Long personalId;
	
	@Column(nullable = false)
	public boolean role; //0->customer 1 ->admin
	
	@Column(nullable = false)
	public String firstName;
	
	@Column(nullable = false)
	public String lastName;
	    
    
	public Users() {
		
	}
    
	public Long getPersonalId() {
		return personalId;
	}

	public void setPersonalId(Long personalId) {
		this.personalId = personalId;
	}

	public boolean getRoleId() {
		return role;
	}

	public void setRoleId(boolean roleId) {
		this.role = roleId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
