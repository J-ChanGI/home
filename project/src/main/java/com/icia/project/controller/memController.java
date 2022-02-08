package com.icia.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.icia.project.service.memService;
import com.icia.project.vo.memVo;

@Controller
public class memController {

	@Autowired
	private memService ms;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping(value="/memjoin")
	public String memjoin() {
		return "membership";
	}
	
	@RequestMapping(value="/membership")
	public String member(@ModelAttribute memVo vo ) {
		ms.member(vo);
		
		return "home";
	}
	
	@RequestMapping(value="/loginjoin")
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping(value="/login")
	public String login(@ModelAttribute memVo vo) {
		
	   String loginid = ms.login(vo);
		
	   if(loginid != null) {
		   session.setAttribute("login", loginid);
	   }
		return "redirect:/";
	}
	
	@RequestMapping(value="/logout")
	public String logout() {
		session.invalidate();
		
		return "redirect:/";
	}
	
	
}
