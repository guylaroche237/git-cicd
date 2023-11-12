package com.guy.crud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ci")
public class MessageController {
	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to my Guy Laroche Page !!";
	}

}
