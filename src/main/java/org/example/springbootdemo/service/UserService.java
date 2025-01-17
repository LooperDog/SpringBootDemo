package org.example.springbootdemo.service;

import org.example.springbootdemo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService{
    Optional<User> findById(Long id);
    void saveUser(User user);
    List<User> findAll();
    void deleteUser(Long id);
}
