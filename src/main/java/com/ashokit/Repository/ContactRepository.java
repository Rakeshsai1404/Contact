package com.ashokit.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
