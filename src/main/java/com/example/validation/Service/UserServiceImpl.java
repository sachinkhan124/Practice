package com.example.validation.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.validation.Repository.UserRepository;
import com.example.validation.dto.UserDto;
import com.example.validation.model.User;

import jakarta.validation.Valid;
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto createUser( UserDto userDto) {
        User user=new User();
         
         user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
		return userDto;
	}

	@Override
	public List<User> getAllusers() {
		
		return userRepository.findAll();
	}
	
//	public User createUser(User user) {
//		return userRepository.save(user);
//	}	
}
