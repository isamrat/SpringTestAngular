package com.tcs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/view")
public class ViewController {
	
	@RequestMapping(value="/home", method=RequestMethod.POST)
	public String getPage() {
		return "home";
	}
	@RequestMapping(value="/empl" , method=RequestMethod.GET)
	public String getPagee() {
		return "emp";
	}
}
