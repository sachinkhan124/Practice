package com.example.validation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDto {

	private int id;
	@NotEmpty
	@Size(min=5, message="username should have at least 5 characters")
	private String name;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;
}
