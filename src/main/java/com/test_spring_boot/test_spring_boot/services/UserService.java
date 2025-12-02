<<<<<<< HEAD
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User findUserById(Long id);

    User findUserByUsername (String username);
    List<User> getAllUsers();


}
=======
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    User findUserById(Long id);

    User findUserByUsername (String username);
    List<User> getAllUsers();


}
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
