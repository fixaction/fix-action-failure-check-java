package com.veracode.asc.example.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class UserControllerTest {
	protected static final Logger logger = LogManager.getLogger();

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="greeting", required=false, defaultValue="Hi") String greeting,
													@RequestParam(name="name", required=false, defaultValue="World") String name, 
													Model model) {
		model.addAttribute("name", name);
		model.addAttribute("greeting", greeting);

		logger.info(greeting, name);
		return "greeting";
	}

}