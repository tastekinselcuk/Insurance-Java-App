package com.InsuranceProject.api.controllers.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.InsuranceProject.business.abstracts.ContactService;
import com.InsuranceProject.entities.concretes.Contact;

@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	
	@PostMapping("/iletisim")
	public String postContact(@ModelAttribute Contact contact) {
		Contact addContact = contactService.saveContact(contact);
		return "index";
	}
	

}
