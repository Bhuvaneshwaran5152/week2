package com.full.springMVC.ticketBooking.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.full.springMVC.ticketBooking.model.Bus;
import com.full.springMVC.ticketBooking.model.UserDetails;
import com.full.springMVC.ticketBooking.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService service;

	@RequestMapping(value = "adminPage")
	public ModelAndView admin(HttpServletResponse response) throws IOException {
		return new ModelAndView("adminPass");
	}

	@RequestMapping(value = "adminPass")
	public ModelAndView adminPass(@RequestParam("password") String password, HttpServletResponse response, Model model)
			throws IOException {
		if (password.equals("admin123")) {
			return new ModelAndView("admin-page");
		} else {
			model.addAttribute("msg", "Password incorrect ADMIN");
			return new ModelAndView("loginMSG");
		}
	}

	@RequestMapping(value = "userDetails")
	public ModelAndView showUserDetails(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {

		Map<String, UserDetails> showUserDetails = service.getUserDetails();
		model.addAttribute("userList", showUserDetails);
		request.setAttribute("userList", showUserDetails);

		return new ModelAndView("admin-page");
	}

	@RequestMapping(value = "getBusDetails")
	public ModelAndView getBusDetails(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {
		String routeId = request.getParameter("routeId");
		String date = request.getParameter("date");
		Bus bus = service.getBusDetails(Integer.parseInt(routeId), date);
		model.addAttribute("bus", bus);
		model.addAttribute("isFirstVisit", false);
		return new ModelAndView("busForm");
	}

	@RequestMapping(value = "getBusForm")
	public ModelAndView getBusForm(HttpServletRequest request, HttpServletResponse response, Model model) {
		model.addAttribute("isFirstVisit", true);
		return new ModelAndView("busForm");
	}

}
