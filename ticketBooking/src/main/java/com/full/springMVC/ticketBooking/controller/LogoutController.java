package com.full.springMVC.ticketBooking.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

	@RequestMapping("/logoutForm")
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		HttpSession session = request.getSession();
		System.out.println(session.getId());
		if (session != null) {
			session.removeAttribute("user");
			// Invalidate the session to log out the user
//			response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
//			response.setHeader("Pragma", "no-cache"); // HTTP 1.0
//			response.setHeader("Expires", "0"); // Proxies
			session.invalidate();
		}
		return new ModelAndView("sign-IN-UP"); // Redirect to the login page after logout
	}
}
