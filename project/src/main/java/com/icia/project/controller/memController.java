package com.icia.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icia.project.service.memService;

@Controller
public class memController {

	@Autowired
	private memService ms;
	
	@RequestMapping(value="/memjoin")
	public String memjoin() {
		return "membership";
	}
}
