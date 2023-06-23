package com.full.springMVC.ticketBooking.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.full.springMVC.ticketBooking.model.Bus;
import com.full.springMVC.ticketBooking.model.UserDetails;
import com.full.springMVC.ticketBooking.service.UtilService;

@Controller
public class BookingController {

	@Autowired
	UtilService utilService;

	@RequestMapping(value = "seatSelection")
	public ModelAndView seatSelection(HttpServletRequest request, HttpServletResponse response, Model model)
			throws IOException {
		String from = request.getParameter("from");
		String to = request.getParameter("to");
		Integer routeId = utilService.getRouteId(from, to);

		String date = request.getParameter("date");
		Bus bus = utilService.getBus(routeId, date);

		request.setAttribute("bus", bus);
		request.setAttribute("fromPlace", utilService.getFullName(from));
		request.setAttribute("toPlace", utilService.getFullName(to));
		request.setAttribute("routeId", routeId);
		model.addAttribute("bus", bus);
		return new ModelAndView("seatSelection");
	}

	@RequestMapping("seatSelectionProcess")
	public ModelAndView SeatBooking(HttpServletRequest request, Model model, HttpServletResponse response) {
		String[] selectedSeats = request.getParameterValues("seats");
		if (selectedSeats == null) {
			model.addAttribute("msg", "Please select a seat to continue");
			return new ModelAndView("loginMSG");
		}
		String routeId = request.getParameter("routeId");
		String date = request.getParameter("date");
		String from = request.getParameter("fromPlace");
		String to = request.getParameter("toPlace");

		if (from.equals(to)) {
			model.addAttribute("msg", "From location and to location cannot be same");
			return new ModelAndView("loginMSG");
		} else {
			HttpSession session = request.getSession();

			session.setAttribute("to", to);
			session.setAttribute("from", from);
			session.setAttribute("selectedSeats", selectedSeats);
			session.setAttribute("routeId", routeId);
			session.setAttribute("date", date);
			UserDetails user = (UserDetails) session.getAttribute("user");
			utilService.bookSeats(selectedSeats, routeId, date, user);
			// String[] seats = new String[selectedSeats.length];

			model.addAttribute("busId", routeId);
			model.addAttribute("selectedSeats", Arrays.toString(selectedSeats));
			model.addAttribute("user", user.getUserName());
			model.addAttribute("from", from);
			model.addAttribute("to", to);
			model.addAttribute("date", date);
			return new ModelAndView("confirmationPage");

		}

	}

//	@RequestMapping(value = "showHistory")
//	public ModelAndView showHistory(HttpServletRequest request, Model model, HttpServletResponse response) {
//		HttpSession session = request.getSession();
//		UserDetails user = (UserDetails) session.getAttribute("user");
//
//		String from = (String) session.getAttribute("from");
//		String to = (String) session.getAttribute("to");
//		String[] selectedSeats = (String[]) session.getAttribute("selectedSeats");
//		String date = (String) session.getAttribute("date");
//		String routeId = (String) session.getAttribute("routeId");
//		// String[] seats = new String[selectedSeats.length];
//
//		model.addAttribute("routeId", routeId);
//		model.addAttribute("selectedSeats", Arrays.toString(selectedSeats));
//		model.addAttribute("user", user.getUserName());
//		model.addAttribute("from", from);
//		model.addAttribute("to", to);
//		model.addAttribute("date", date);
//		return new ModelAndView("confirmationPage");
//	}
}
