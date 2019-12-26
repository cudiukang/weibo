package com.cdk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	@RequestMapping("test")
	public String test(String name,Model model) {
		model.addAttribute("name", name);
		return "test";
	}
}
