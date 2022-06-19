package com.app.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.registration.model.Noname;
import com.app.registration.repository.RegistrationRepository;

@Service
public class RegistrationService {

	@Autowired
	private RegistrationRepository repo;

	public Noname saveUser(Noname user) {
		return repo.save(user);
	}

	public Noname fetchUserByEmailId(String emailId) {
		return repo.findByEmailId(emailId);
	}
	
	public Noname fetchUserByEmailIdAndPassword(String emailId,String password) {
		return repo.findByEmailIdAndPassword(emailId,password);
	}
	// Here repo.findByEmailID is not available so we need to just declare it in
	// repository .

}
