package com.academy.dashboard.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/")
	public String dashboard() {
		return "Welcome to the Scaler Academy!";
	}
	
}
