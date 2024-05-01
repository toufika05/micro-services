package com.example.recharge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recharges")
public class MyController {
	
	@GetMapping
	public String getRecharge() {
		return "Recharge done";
	}

}
