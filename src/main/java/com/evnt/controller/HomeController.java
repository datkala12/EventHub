package com.evnt.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"","/home"})
	public String home(Model model, Principal principal) {
		return "home";
	}

//	@GetMapping({"admin","admin/home"})
//	public String admin() {
//		return "redirect:/assets/admin/index.html";
//	}
}
