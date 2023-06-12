package com.full.secondMonthProject.database;

import java.util.HashMap;

import org.apache.catalina.User;

import com.full.secondMonthProject.dao.UserDetails;

public class UsersTable {

	private HashMap<String, UserDetails> users;

	UsersTable() {
		users = new HashMap<String, UserDetails>();
	}

	public void saveUser(String username, UserDetails user) {
		users.put(username, user);
	}

	public UserDetails getUser(String username) {
		return users.get(username);

	}

}
