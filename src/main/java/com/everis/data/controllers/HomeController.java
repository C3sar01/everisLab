package com.everis.data.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/")
	public String pagina1(Model model) {
		model.addAttribute("parametro1", "clase everis lunes am");
		
		return "index.jsp";
		
		
	}
	
	
	
	

	

}
