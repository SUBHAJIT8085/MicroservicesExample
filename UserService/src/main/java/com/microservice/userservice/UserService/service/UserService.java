package com.microservice.userservice.UserService.service;

import com.microservice.userservice.UserService.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public User saveUser(User user);
    public User getUser(int id);
    public List<User> getUsers();
}
