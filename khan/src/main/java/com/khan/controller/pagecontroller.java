package com.khan.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class pagecontroller {
	@RequestMapping (value= {"/","/home","/index"})
	public ModelAndView index()
	{
		ModelAndView mav=new ModelAndView("page");
		mav.addObject("hello","this is frontend");
		return mav;
		
	}

}
