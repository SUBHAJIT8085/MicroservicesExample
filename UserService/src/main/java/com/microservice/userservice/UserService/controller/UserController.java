package com.microservice.userservice.UserService.controller;

import com.microservice.userservice.UserService.entities.User;
import com.microservice.userservice.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public ResponseEntity<User> createUser(@RequestBody User u){
        userService.saveUser(u);
        return ResponseEntity.status(HttpStatus.CREATED).body(u);
    }
    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable int userId){
        User user1 = userService.getUser(userId);
        return  ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    @GetMapping
    public  ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.getUsers();
        return  ResponseEntity.status(HttpStatus.CREATED).body(users);
    }

}
