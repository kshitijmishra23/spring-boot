package com.academy.dashboard.welcome;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.qos.logback.classic.Logger;

@Controller
public class WelcomeController {

	
	Logger logger = (Logger) LoggerFactory.getLogger(WelcomeController.class);
	@RequestMapping("/")
	public String dashboard(Model model) {
		logger.info("Error logged here!!");
		model.addAttribute("welcome","Hello! Welcome to the Scaler Academy!");
		return "welcome";
	}
	
}
