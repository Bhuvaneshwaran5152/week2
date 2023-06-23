package com.full.springMVC.ticketBooking.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.full.springMVC.ticketBooking.database.BusTable;
import com.full.springMVC.ticketBooking.database.RouteMapTable;
import com.full.springMVC.ticketBooking.model.Bus;
import com.full.springMVC.ticketBooking.model.Seat;
import com.full.springMVC.ticketBooking.model.UserDetails;

@Component
public class UtilService {

	@Autowired
	RouteMapTable routeTable;
	@Autowired
	BusTable busTable;

	public String getFullName(String code) {
		switch (code) {
		case "CHN": {
			return "Chennai";
		}
		case "MDU": {
			return "Madurai";

		}
		case "BLR": {
			return "Banglore";

		}
		default: {
			return null;
		}
		}
	}

	public Integer getRouteId(String from, String to) {
		String key = from + "-" + to;
		return routeTable.getRouteMap().get(key);
	}

	public Bus getBus(Integer routeId, String date) {
		Map<String, Bus> busDateMap = busTable.getBusData().get(routeId);
		if (!busDateMap.containsKey(date)) {
			System.out.println("creating new bus for" + routeId + "+" + date);
			busDateMap.put(date, new Bus());
		}
		return busDateMap.get(date);
	}

	public void bookSeats(String[] selectedSeats, String routeId, String date, UserDetails user) {
		Bus bus = busTable.getBusData().get(Integer.parseInt(routeId)).get(date);

		for (int i = 0; i < selectedSeats.length; i++) {
			Integer seatNo = Integer.parseInt(selectedSeats[i]);
			Seat seat = bus.getSeatMap().get(seatNo);
			seat.setStatus(true);
			seat.setUserDetails(user);
		}

	}
}
