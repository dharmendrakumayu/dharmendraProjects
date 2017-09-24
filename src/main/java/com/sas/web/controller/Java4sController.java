package com.sas.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sas.web.model.RegistrationModel;
import com.sas.web.serviceImpl.RegistrationServiceImpl;

@Controller
public class Java4sController {	
	 
	   @Autowired
	   public RegistrationServiceImpl  registrationServiceImpl;
	   
	   
	    @RequestMapping("/welcomePage")
	    public ModelAndView helloWorld( @ModelAttribute("RegistrationModel") RegistrationModel model) {
	        return new ModelAndView("welcomePage");
	    }
	
	    @RequestMapping("/Registration")
	    public ModelAndView saveRegistration( @ModelAttribute("RegistrationModel") RegistrationModel model) {
	    	System.out.println("action");
	    	System.out.println(model.getCurrentYear());
	    	registrationServiceImpl.saveUsers(model);
	        return new ModelAndView("Registration");
	    }
}
