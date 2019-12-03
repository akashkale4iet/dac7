package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyExamController {
	
	
	@RequestMapping("/")
	public ModelAndView leaveForm()
	{
		String msg="hello";
		return new ModelAndView("leave","msg",msg);
	}

}
