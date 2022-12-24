package com.InsuranceProject.dataAccess.abstracts.Products;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Products.Structure;

public interface StructureDao extends JpaRepository<Structure, Integer> {

}
