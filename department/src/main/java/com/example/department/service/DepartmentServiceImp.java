package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.model.Department;
import com.example.department.repository.DepartmentRepo;

//@Component
@Service
public class DepartmentServiceImp implements DepartmentService{
	
	@Autowired
	DepartmentRepo repository;
	
	public Department save(Department department) {
		return repository.save(department);
		
	}
  
	
 public	Department getDepartment(int id) {
		return repository.findById(id).orElse(null);
		
	}
}
