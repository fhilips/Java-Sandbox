package com.alura.springdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
	
	@GetMapping
	@RequestMapping("/home")
	public String hello() {
		//System.out.println("tes");
		return "home";
	}
}
