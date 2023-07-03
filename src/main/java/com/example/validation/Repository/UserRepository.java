package com.example.validation.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.validation.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
