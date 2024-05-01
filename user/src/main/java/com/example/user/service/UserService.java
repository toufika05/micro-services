package com.example.user.service;

import com.example.user.model.UserDTO;
import com.example.user.valueobject.ResponseVO;

public interface UserService {

	UserDTO save(UserDTO dto);

	UserDTO getUser(int id);

	ResponseVO getUserDepartment(int id);

}
