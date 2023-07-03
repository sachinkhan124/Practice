package com.example.validation.Service;

import com.example.validation.dto.UserDto;
import com.example.validation.model.User;

import jakarta.validation.constraints.AssertFalse.List;

public interface IUserService {

	
	public UserDto createUser(UserDto userDto);
	public java.util.List<User> getAllusers();
	//public User createUser(User user); 
}
