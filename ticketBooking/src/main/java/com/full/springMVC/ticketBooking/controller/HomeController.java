package com.full.springMVC.ticketBooking.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.full.springMVC.ticketBooking.database.UserDataBase;
import com.full.springMVC.ticketBooking.database.UsersTable;
import com.full.springMVC.ticketBooking.model.UserDetails;
import com.full.springMVC.ticketBooking.service.LoginService;
import com.full.springMVC.ticketBooking.service.RegisterService;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public ModelAndView home(HttpServletResponse response) throws IOException {
		return new ModelAndView("sign-IN-UP");
	}

	@RequestMapping(value = "signInUP")
	public ModelAndView secondPage(HttpServletResponse response) throws IOException {
		return new ModelAndView("sign-IN-UP");
	}

	@RequestMapping(value = "registerController")
	public ModelAndView register(HttpServletResponse response) throws IOException {
		return new ModelAndView("register");
	}

	@RequestMapping(value = "loginController")
	public ModelAndView login(HttpServletResponse response) throws IOException {
		return new ModelAndView("login");
	}

	@RequestMapping(value = "/register")
	public ModelAndView register(@RequestParam("username") String name, @RequestParam("password") String password,
			@RequestParam("email") String email, Model model) throws IOException {

		RegisterService registerService = new RegisterService();
		Boolean register = registerService.register(name, password, email);
		if (register) {
			return new ModelAndView("registerSuccess");
		} else {
			return new ModelAndView("registerFailure");
		}
	}

	@RequestMapping(value = "/loginMSG")
	public ModelAndView loginMSG(@RequestParam("username") String email, @RequestParam("password") String password,
			Model model, HttpServletRequest request) throws IOException {
		LoginService loginService = new LoginService();
		String login = loginService.login(email, password);
		if (login.equals("success")) {
			HttpSession session = request.getSession(true);
			UsersTable table = UserDataBase.getUsersTable();
			UserDetails user = table.getUser(email);
			session.setAttribute("user", user);

			model.addAttribute("msg", "Login Successfull");
			return new ModelAndView("booking");
		} else if (login.equals("failure")) {
			model.addAttribute("msg", "Username password miss-match");
			return new ModelAndView("loginMSG");
		} else {
			model.addAttribute("msg", "UserNotFound");
			return new ModelAndView("loginMSG");
		}

	}
}
