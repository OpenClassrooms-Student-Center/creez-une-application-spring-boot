package com.openclassrooms.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.openclassrooms.models.User;
import com.openclassrooms.repositories.UserRepository;

@Controller
public class HomeController {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@GetMapping("/")
	public ModelAndView home() {

		// To render a view with home.jsp
		ModelAndView mav = new ModelAndView("home");

		// Retrieve a user in database
		Optional<User> u = userRepository.findById(1);
		
		// Forward data to view
		mav.addObject("username",u.get().getName());

		return mav;
	}

}