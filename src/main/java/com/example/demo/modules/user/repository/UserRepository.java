package com.example.demo.modules.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.modules.user.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
