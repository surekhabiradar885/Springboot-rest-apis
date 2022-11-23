package com.springboot.restspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/currency-service")
	public CurrencyServiceConfiguration retriveAllValues(){
		return configuration;
	}

}
