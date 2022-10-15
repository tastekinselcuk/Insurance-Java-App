package com.InsuranceProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.CarCategories;

public interface CarCategoriesDao extends JpaRepository<CarCategories, Integer> {

	CarCategories getBycategoryName(String categoryName); //Araç kategorisiyle araç bulma

}
