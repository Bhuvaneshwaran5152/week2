package com.full.springMVC.ticketBooking.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class SessionInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		HttpSession session = request.getSession(false);
		String loginURI = request.getContextPath() + "/loginController";
		String loginValidationURI = request.getContextPath() + "/loginMSG";
		String registerCTRL = request.getContextPath() + "/registerController";
		String registerURI = request.getContextPath() + "/register";
		String adminURI = request.getContextPath() + "/adminPage";
		boolean isLoginRequest = request.getRequestURI().equals(loginURI);
		boolean isLoginPage = request.getRequestURI().endsWith("login.jsp");
		boolean isLoginValidation = request.getRequestURI().equals(loginValidationURI);
		boolean isRegister = request.getRequestURI().equals(registerURI);
		boolean isRegisterCTRL = request.getRequestURI().equals(registerCTRL);
		boolean isAdmin = request.getRequestURI().contains("/admin");

		if (session == null || session.getAttribute("user") == null) {

			if (isLoginPage || isLoginRequest || isLoginValidation || isRegister || isRegisterCTRL || isAdmin) {
				return true;
			}
			response.sendRedirect(request.getContextPath() + "/loginController");
			return false;
		}
		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// This method is called after the handler is executed, but before the view is
		// rendered.
		// You can perform additional operations or modify the ModelAndView object here.
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// This method is called after the view is rendered.
		// You can perform any cleanup or logging operations here.
	}
}
