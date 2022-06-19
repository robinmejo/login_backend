package com.app.registration.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Noname {
	@Id
	private int id;
	private String username;
	private String emailId;
	private String password;

	public Noname() {

	}

	public Noname(int id, String username, String emailId, String password) {
		super();
		this.id = id;
		this.username = username;
		this.emailId = emailId;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
