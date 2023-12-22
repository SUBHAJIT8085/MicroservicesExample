package com.microservice.userservice.UserService.repository;

import com.microservice.userservice.UserService.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
