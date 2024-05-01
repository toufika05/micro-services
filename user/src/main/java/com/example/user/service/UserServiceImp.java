package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.user.model.UserDTO;
import com.example.user.repository.UserRepository;
import com.example.user.valueobject.Department;
import com.example.user.valueobject.ResponseVO;

@Service
public class UserServiceImp implements UserService{

	@Autowired
	UserRepository repository;
	
	@Autowired
	private RestTemplate template;
	
	@Override
	public UserDTO save(UserDTO dto) {
		
		return repository.save(dto);
	}

	@Override
	public UserDTO getUser(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public ResponseVO getUserDepartment(int id) {
		ResponseVO vo=new ResponseVO();
		UserDTO dto = repository.findById(id).orElse(null);
		//Department department = template.getForObject("http://localhost:9001/depertments/get/"+dto.getDepartmentId(), Department.class);
		Department department = template.getForObject("http://DEPARTMENT/depertments/get/"+dto.getDepartmentId(), Department.class);
		vo.setUser(dto);
		vo.setDept(department);
		return vo;
	} 

}
