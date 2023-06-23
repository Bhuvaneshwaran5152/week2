package com.full.springMVC.ticketBooking.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.full.springMVC.ticketBooking.database.BusTable;
import com.full.springMVC.ticketBooking.database.UserDataBase;
import com.full.springMVC.ticketBooking.database.UsersTable;
import com.full.springMVC.ticketBooking.model.Bus;
import com.full.springMVC.ticketBooking.model.UserDetails;

@Service
public class AdminService {
	@Autowired
	BusTable busTable;
	
	@Autowired
	UtilService utilService;
	
	private UsersTable table=null;
	public Map<String, UserDetails> getUserDetails()
	{
		table = UserDataBase.getUsersTable();
		return table.showUserDetails();
	}
	
	public Bus getBusDetails(Integer routeId,String date)
	{
		
		Map<String, Bus> busDateMap = busTable.getBusData().get(routeId);
		if (!busDateMap.containsKey(date)) {
			System.out.println("booking not opened" );
			return null;
		}
		return busDateMap.get(date);
	}
}
