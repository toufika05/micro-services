package com.example.phonepe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("phonepes")
public class PhonepeController {
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	@CircuitBreaker(name="recharge", fallbackMethod="rechargeServiceDown")
	public String getPhonepe() {
		String output=restTemplate.getForObject("http://localhost:9001/recharges", String.class);
		return output+" via phonepe";
		}
	public String rechargeServiceDown(Exception e) {
		return "Recharge service is down,please continue its services";
	}
}     
