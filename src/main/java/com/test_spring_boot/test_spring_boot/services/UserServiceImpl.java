<<<<<<< HEAD
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.Repositories.RoleRepository;
import com.test_spring_boot.test_spring_boot.Repositories.UserRepository;
import com.test_spring_boot.test_spring_boot.entities.Role;
import com.test_spring_boot.test_spring_boot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;
    @Autowired
    RoleRepository roleRep;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User saveUser(User user) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        List<Role>roles=new ArrayList<>();
        Role r=roleRep.findByRole("USER");
        roles.add(r);
        user1.setRoles(roles);
        return userRepo.save(user1);

    }
    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }



}
=======
package com.test_spring_boot.test_spring_boot.services;

import com.test_spring_boot.test_spring_boot.Repositories.RoleRepository;
import com.test_spring_boot.test_spring_boot.Repositories.UserRepository;
import com.test_spring_boot.test_spring_boot.entities.Role;
import com.test_spring_boot.test_spring_boot.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepo;
    @Autowired
    RoleRepository roleRep;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public User saveUser(User user) {
        User user1 = new User();
        user1.setUsername(user.getUsername());
        user1.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        List<Role>roles=new ArrayList<>();
        Role r=roleRep.findByRole("USER");
        roles.add(r);
        user1.setRoles(roles);
        return userRepo.save(user1);

    }
    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public User findUserByUsername(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }



}
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
