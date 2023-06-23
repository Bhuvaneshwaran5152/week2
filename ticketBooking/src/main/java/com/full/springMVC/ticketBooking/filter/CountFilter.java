package com.full.springMVC.ticketBooking.filter;

import java.io.IOException;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/seatSelectionProcess")
public class CountFilter implements Filter {

	private int requestCount = 0;

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest httprequest = (HttpServletRequest) request;
		String user = httprequest.getRemoteAddr(); // Using remote address as the user identifier

		// Increment the request count for the user

		requestCount++;

		System.out.println("Total No of Bookings done -" + requestCount);
		// Pass the request along the filter chain
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		requestCount = 0;
	}

}
