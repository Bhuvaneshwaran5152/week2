package com.full.springMVC.ticketBooking.model;

import java.util.HashMap;
import java.util.Map;

public class Bus {
	private Integer busId;
	private String from;
	private String to;
	private Boolean isAC;
	private String busTimings;

	private Map<Integer, Seat> seatMap;

	public Bus() {
		super();
		// TODO Auto-generated constructor stub
		Map<Integer, Seat> map = new HashMap<Integer, Seat>();
		for (int i = 1; i <= 20; i++) {
			map.put(i, new Seat(i, null, false, null));

		}
		this.setSeatMap(map);
	}

	public Integer getBusId() {
		return busId;
	}

	public void setBusId(Integer busId) {
		this.busId = busId;
	}

	public String getBusTimings() {
		return busTimings;
	}

	public void setBusTimings(String busTimings) {
		this.busTimings = busTimings;
	}

	public Bus(Integer busId, String from, String to, Boolean isAC, String busTimings, Map<Integer, Seat> seatMap) {
		super();
		this.busId = busId;
		this.from = from;
		this.to = to;
		this.isAC = isAC;
		this.busTimings = busTimings;
		this.seatMap = seatMap;
	}

	public Integer getRouteId() {
		return busId;
	}

	public void setRouteId(Integer busId) {
		this.busId = busId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Boolean getIsAC() {
		return isAC;
	}

	public void setIsAC(Boolean isAC) {
		this.isAC = isAC;
	}

	public Map<Integer, Seat> getSeatMap() {
		return seatMap;
	}

	public void setSeatMap(Map<Integer, Seat> seatMap) {
		this.seatMap = seatMap;
	}

}
