package com.full.springMVC.ticketBooking.model;

public class Seat {
	private Integer seatNo;
	private String gender;
	private Boolean status;
	private UserDetails userDetails;

	public Integer getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(Integer seatNo) {
		this.seatNo = seatNo;
	}

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seat(Integer seatNo, String gender, Boolean status, UserDetails userDetails) {
		super();
		this.seatNo = seatNo;
		this.gender = gender;
		this.status = status;
		this.userDetails = userDetails;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

}
