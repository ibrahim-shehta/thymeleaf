package com.example.demo.modules.user.service;

import java.util.Optional;

import com.example.demo.modules.user.model.User;

public interface UserService {
	
	Optional<User> findById(long id);

}
