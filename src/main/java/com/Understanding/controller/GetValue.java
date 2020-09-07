package com.Understanding.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class GetValue {
	
	//@Value with ${} will get the value from property file(key-value)
	@Value("${app.value}")
	public String value;
	
	
	// we can use nested values from property file : (check property file)
	@Value("${app.descripion:}")
	public String desc;
	
	//set up Default values for @value annotation
	@Value("${app.default: some default message}")
	public String deflt;
	
	@GetMapping(value = "/message")
	public String getMessage() {
		return value + desc + deflt;
	}
	
//	
//	@GetMapping(value = "/desc")
//	public String getDesc() {
//		return desc;
//		
//	}
}
