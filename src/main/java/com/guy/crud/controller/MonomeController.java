package com.guy.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/monome")
public class MonomeController {
	
	@GetMapping("/salut/{name}")
	public String getMessage(@PathVariable String name) {
		return "Bonjour Mdame :"+name;
	}

}
