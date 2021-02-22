package com.ashokit.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.ashokit.Service.ContactService;

@RestController
public class ContactRestController {
	
	private ContactService contactService;

	public ContactRestController(ContactService contactService) {
		
		this.contactService = contactService;
	}
	
	// we should write methods here
	

}
