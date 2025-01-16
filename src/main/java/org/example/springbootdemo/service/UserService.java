package org.example.springbootdemo.service;

import org.example.springbootdemo.model.User;

import java.util.List;

public interface UserService{
    User findById(Long id);
    User saveUser(User user);
    List<User> findAllUsers();
    void deleteUser(Long id);
}
