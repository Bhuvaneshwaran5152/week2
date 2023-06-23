package com.full.springMVC.ticketBooking.database;

import java.util.Map;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.full.springMVC.ticketBooking.model.Bus;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BusTable {

	private Map<Integer, Map<String, Bus>> busData;

	public Map<Integer, Map<String, Bus>> getBusData() {
		return busData;
	}

	public void setBusData(Map<Integer, Map<String, Bus>> busData) {
		this.busData = busData;
	}
}
