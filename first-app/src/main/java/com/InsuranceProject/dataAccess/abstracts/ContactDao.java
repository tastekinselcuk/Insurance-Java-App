package com.InsuranceProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.InsuranceProject.entities.concretes.Contact;

public interface ContactDao extends JpaRepository<Contact, Integer>{

}
