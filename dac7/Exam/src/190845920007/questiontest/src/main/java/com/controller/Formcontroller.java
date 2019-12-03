package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.service.UserInterface;

@Controller
public class Formcontroller {
	@Autowired
	UserInterface us;
	
	@RequestMapping("/")
	public String welcomePage() {
		
		
		return "welcome";
				
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addUser() {
		return new ModelAndView("referral");
		
			
	}
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	public ModelAndView insertUser(@RequestParam ("fname") String fname,@RequestParam ("lname") String lname,@RequestParam ("cno") String cno,@RequestParam ("email") String email,@RequestParam ("bdate") String bdate,@RequestParam ("city") String city) {
			
		int ans=us.insert(fname,lname,cno,email,bdate,city);
		
		return new ModelAndView("redirect:/");
		
			
	}
	

}
