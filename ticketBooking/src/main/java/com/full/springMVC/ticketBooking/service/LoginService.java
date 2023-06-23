package com.full.springMVC.ticketBooking.service;

import com.full.springMVC.ticketBooking.database.UserDataBase;
import com.full.springMVC.ticketBooking.database.UsersTable;
import com.full.springMVC.ticketBooking.model.UserDetails;

public class LoginService {
	private UsersTable table;

	public String login(String email, String password) {
		table = UserDataBase.getUsersTable();
		UserDetails user = table.getUser(email);
		if (user != null) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				return "success";
			} else {
				return "failure";
			}
		} else {
			return "UserNotFound";
		}

	}

}
