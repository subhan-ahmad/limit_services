package com.subhan.limit_services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subhan.limit_services.beans.Limit_configuration;

@RestController
public class limit_service_Controller {
	@Autowired
	private Limit_configuration config;
	
	public Limit_configuration getConfig() {
		return config;
	}

	public void setConfig(Limit_configuration config) {
		this.config = config;
	}
	@GetMapping("/limitServices")

	public Limit_configuration getConfiguredValues() {
		Limit_configuration obj = new Limit_configuration(config.getMaximumLimit(), config.getMinimumLimit());
	
		
		return  obj;
	}
	
}
