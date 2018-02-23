package com.niit.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.DAO.UserDAO;
import com.niit.model.User;



@Controller
public class HelloController {

	@Autowired
UserDAO userDAO;
	 
	   @RequestMapping(value = "/hello", method = RequestMethod.GET)
	   public String printHello(ModelMap model) {
	      model.addAttribute("message", "Hello Spring");
	      return "login";
	   }
	   
	   
	   @RequestMapping(value = "/check", method = RequestMethod.GET)
	   public String printHello2() {
	      return "home";
	   }
	   
	   
	   @RequestMapping(value = "/register", method = RequestMethod.GET)
	   public String register(Model m) {
		   m.addAttribute("u", new User());
		   
	      return "register";

	}
	   
	   
	   @RequestMapping( value = "/saveRegister",method = RequestMethod.POST)
	   public ModelAndView register(@ModelAttribute User cmd){
	       ModelAndView mav=new ModelAndView();
	       userDAO.addUser(cmd);
	       mav.setViewName("home");
	   return mav;

	   }
	       
	       
	   
	   
	   @RequestMapping(value = "/about", method = RequestMethod.GET)
	   public String about() {
	      return "about";

	}
}


