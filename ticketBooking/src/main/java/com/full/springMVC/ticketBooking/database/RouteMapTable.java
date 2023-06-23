package com.full.springMVC.ticketBooking.database;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class RouteMapTable {

	private Map<String,Integer> routeMap;

	public Map<String, Integer> getRouteMap() {
		return routeMap;
	}

	public void setRouteMap(Map<String, Integer> routeMap) {
		this.routeMap = routeMap;
	}

	@PostConstruct
	public void setDefaultRouteMap()
	{
		Map<String,Integer> route=new HashMap<String,Integer>();
		route.put("CHN-MDU", 1);
		route.put("MDU-CHN", 2);
		route.put("CHN-BLR", 3);
		route.put("BLR-CHN", 4);
		route.put("BLR-MDU", 5);
		route.put("MDU-BLR", 6);
		this.setRouteMap(route);
	}
	
}
