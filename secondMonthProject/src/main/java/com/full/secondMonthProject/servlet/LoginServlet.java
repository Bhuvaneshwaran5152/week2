package com.full.secondMonthProject.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.secondmonth.dao.UserDetails;
import com.secondmonth.database.DataBase;
import com.secondmonth.database.UsersTable;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private UsersTable table;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		table = DataBase.getUsersTable();
		UserDetails user = table.getUser(username);

		if (user != null) {
			if (user.getPassword().equals(password)) {
				response.getWriter().println("Login successful!");
				System.out.println(user.getUserName());
//				HttpSession session = request.getSession(true);
//
//				session.setAttribute("username", username);
//
//				String sessionId = session.getId();
//
//				Cookie sessionCookie = new Cookie("sessionId", sessionId);
//				sessionCookie.setMaxAge(3600);
//				response.addCookie(sessionCookie);

				Cookie cookie = new Cookie(user.getUserName(), user.getUserName());

				cookie.setMaxAge(60);
				response.getWriter().println("Welcome " + user.getUserName());
				response.addCookie(cookie);
				response.sendRedirect("details.jsp");
			} else {
				response.getWriter().println("Username and password doesn't match ");
			}
		} else {
			response.getWriter().println("User not found...Please Register and Login again");
		}
	}
}
