package com.InsuranceProject.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.InsuranceProject.business.abstracts.ContactService;
import com.InsuranceProject.dataAccess.abstracts.ContactDao;
import com.InsuranceProject.entities.concretes.Contact;

@Service
public class ContactManager implements ContactService {

	private ContactDao contactDao;
	
	@Autowired
	public ContactManager(ContactDao contactDao) {
		this.contactDao = contactDao;
	}
	
	@Override
	public Contact saveContact(Contact contact) {
		return contactDao.save(contact);
	}



}
