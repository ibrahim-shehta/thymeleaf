package com.example.demo.modules.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.modules.user.model.User;
import com.example.demo.modules.user.repository.UserRepository;

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	public Optional<User> findById(long id) {
		return userRepo.findById(id);
	}

}
