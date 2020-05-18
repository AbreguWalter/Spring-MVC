package com.bolsadeideas.springboot.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String Home() {
//		return "redirect:/app/index"; //recarga la ruta porque cambia la ruta
		return "format:/app/index"; //no se recargan los parametros
	}
}
