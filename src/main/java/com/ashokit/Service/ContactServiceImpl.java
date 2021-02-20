package com.ashokit.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashokit.Entity.Contact;
import com.ashokit.Repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService{
	
	private ContactRepository contactRepo;
	
	public ContactServiceImpl(ContactRepository contactRepo) {
		
		this.contactRepo = contactRepo;
	}

	@Override
	public boolean saveContact(Contact contact) {
		
		Contact savedContact = contactRepo.save(contact);
		
		return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		
		return null;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		
		return null;
	}

	@Override
	public boolean deleteContactById(Integer contactId) {
		
		return false;
	}

}
