package com.InsuranceProject.entities.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.CarObject;

public interface CarObjectDao extends JpaRepository<CarObject, Integer> {

}
