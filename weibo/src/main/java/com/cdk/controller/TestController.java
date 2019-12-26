package com.cdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class TestController {
	
	public String test(String name,Model model) {
		model.addAttribute("name", name);
		return "test";
	}
}
