package com.example.demo.wb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@GetMapping("/addbook")
	public String addbook() {
		return "addbook";
	}
}