package com.full.secondMonthProject.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.full.secondMonthProject.dao.UserDetails;
import com.full.secondMonthProject.database.UserDataBase;
import com.full.secondMonthProject.database.UsersTable;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

	private UsersTable table;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		table = UserDataBase.getUsersTable();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));

		if (table.getUser(username) != null) {
			response.getWriter().println("Username already exists. Please choose a different username.");
		} else {
			UserDetails user = new UserDetails();
			user.setUserName(username);
			user.setPassword(password);
			user.setAge(age);
			table.saveUser(username, user);
			response.getWriter().println("Registration successful!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			response.sendRedirect("login.html");
		}
	}
}
