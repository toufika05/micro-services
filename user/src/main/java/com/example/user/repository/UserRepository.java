package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.model.UserDTO;

@Repository
public interface UserRepository  extends JpaRepository<UserDTO,Integer>{
	

}
