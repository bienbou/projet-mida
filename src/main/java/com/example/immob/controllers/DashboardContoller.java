package com.example.immob.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class DashboardContoller {
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String dashboard() {
		return "admin.dashboard.dashboard1";
	}

}
