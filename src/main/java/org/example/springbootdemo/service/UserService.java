package org.example.springbootdemo.service;

import org.example.springbootdemo.model.User;

import java.util.List;

public interface UserService{
    User findById(Long id);
    void saveUser(User user);
    List<User> findAll();
    void deleteUser(Long id);
}
