package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User findUserById(Long id);

    User findUserByUsername (String username);
    List<User> getAllUsers();


}
