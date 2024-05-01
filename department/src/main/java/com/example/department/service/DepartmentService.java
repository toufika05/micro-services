package com.example.department.service;

import com.example.department.model.Department;

public interface DepartmentService {
	
   public Department save(Department department);
   
   Department getDepartment(int id);
}
    