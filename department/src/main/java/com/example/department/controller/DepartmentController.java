package com.example.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.model.Department;
import com.example.department.service.DepartmentService;

@RestController
@RequestMapping("/depertments")
public class DepartmentController {

	@Autowired
	DepartmentService service;
	
	@PostMapping("/save")
	public Department save(@RequestBody Department department) {
        return service.save(department);
		
	}
	
	@GetMapping("/get/{id}")
	public Department getDepartment(@PathVariable("id") int id) {
		return service.getDepartment(id);
	}
}
