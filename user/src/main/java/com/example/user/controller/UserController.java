package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.model.UserDTO;
import com.example.user.service.UserService;
import com.example.user.valueobject.ResponseVO;

@RestController
@RequestMapping("/users")
public class UserController {
  
	
	@Autowired
	UserService service;
	
	@PostMapping("/save")
	public UserDTO save(@RequestBody UserDTO dto) {
		return service.save(dto);
	}
	
	@GetMapping("/get/{id}")
	public UserDTO getUser(@PathVariable("id") int id) {
		return service.getUser(id);
		
	}
	
	
	@GetMapping("/getUserDepartment/{id}")
	public ResponseVO getUserDepartment(@PathVariable("id") int id) {
		return service.getUserDepartment(id);
		
	}
	
	
	
	
	
	
	
	
	
}
