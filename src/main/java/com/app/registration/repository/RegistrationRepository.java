package com.app.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.registration.model.Noname;

public interface RegistrationRepository extends JpaRepository<Noname, Integer> {

	public Noname findByEmailId(String emailId);

	public Noname findByEmailIdAndPassword(String emailId, String password);

}
