package com.full.springMVC.ticketBooking.service;

import org.springframework.stereotype.Service;

import com.full.springMVC.ticketBooking.database.UserDataBase;
import com.full.springMVC.ticketBooking.database.UsersTable;
import com.full.springMVC.ticketBooking.model.UserDetails;

@Service
public class RegisterService {
	private UsersTable table;

	public Boolean register(String username, String password, String email) {
		table = UserDataBase.getUsersTable();
		if (table.getUser(email) != null) {
			return false;
		} else {
			UserDetails user = new UserDetails();
			user.setUserName(username);
			user.setPassword(password);
			user.setEmail(email);
			table.saveUser(email, user);
			return true;
		}

	}
}
