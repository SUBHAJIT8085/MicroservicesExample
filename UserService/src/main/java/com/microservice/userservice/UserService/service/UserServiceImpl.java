package com.microservice.userservice.UserService.service;

import com.microservice.userservice.UserService.entities.User;
import com.microservice.userservice.UserService.exception.ResourceNotFoundException;
import com.microservice.userservice.UserService.repository.UserRepository;
import com.microservice.userservice.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userrepo;
    @Override
    public User saveUser(User user) {
        return userrepo.save(user);
    }

    @Override
    public User getUser(int id) {
       return userrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("user is not find with the given id"));
    }

    @Override
    public List<User> getUsers() {
        return userrepo.findAll();
    }
}
