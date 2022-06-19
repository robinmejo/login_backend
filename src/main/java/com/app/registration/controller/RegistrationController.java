package com.app.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.registration.model.Noname;
import com.app.registration.service.RegistrationService;

@RestController
//Every method will return the response not UI when we use rest controller
public class RegistrationController {
	@Autowired
	private RegistrationService service;

	@PostMapping("/register")
	public Noname registerUser(@RequestBody Noname user) throws Exception {
		String tempemailId = user.getEmailId();
		if (tempemailId != null && !"".equals(tempemailId)) {
			Noname userObj = service.fetchUserByEmailId(tempemailId);
			if (userObj != null) {
				throw new Exception("User with " + tempemailId + " already exists");
			}
		}
		Noname userObj = null;
		userObj = service.saveUser(user);
		return userObj;
	}
	@PostMapping("/login")
	public Noname loginUser(@RequestBody Noname user)throws Exception {
		String tempEmailId =user.getEmailId();
		String tempPass=user.getPassword();
		Noname userObj=null;
		if(tempEmailId !=null&& tempPass!=null) {
			
			userObj=service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj==null) {
			throw new Exception("Bad credentials");
		}
		return userObj;
	}
}
