package com.full.springMVC.ticketBooking.database;

import java.util.HashMap;
import java.util.Map;

import com.full.springMVC.ticketBooking.model.UserDetails;

public class UsersTable {

	private HashMap<String, UserDetails> users;

	UsersTable() {
		users = new HashMap<String, UserDetails>();
	}

	public void saveUser(String email, UserDetails user) {
		users.put(email, user);
	}

	public UserDetails getUser(String email) {
		return users.get(email);

	}

	public Map<String, UserDetails> showUserDetails() {
		return users;
	}
}
