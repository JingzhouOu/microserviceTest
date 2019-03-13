package com.jingzhou.microserviceTest.controller;

import com.jingzhou.microserviceTest.entity.User;
import com.jingzhou.microserviceTest.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jingzhou Ou
 * Created on 17-10-26
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRepository.findById(id).orElse(null);
        return user;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        List<User> allUsers = this.userRepository.findAll();
        return allUsers;
    }

}
