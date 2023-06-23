package com.full.springMVC.ticketBooking.config;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.full.springMVC.ticketBooking.database.BusTable;
import com.full.springMVC.ticketBooking.model.Bus;

@Configuration
@ComponentScan(basePackages = "com.full.springMVC.ticketBooking")
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {

	@Autowired
	BusTable busTable;

	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@PostConstruct
	public void constructBusTable() {
		Map<Integer, Map<String, Bus>> source = new HashMap<Integer, Map<String, Bus>>();
		for (int i = 1; i <= 6; i++) {
			Map<String, Bus> busDataMap = new HashMap<String, Bus>();
			source.put(i, busDataMap);
		}
		busTable.setBusData(source);
	}

}
