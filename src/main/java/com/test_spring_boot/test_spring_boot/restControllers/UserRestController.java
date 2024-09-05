package com.test_spring_boot.test_spring_boot.restControllers;

import com.test_spring_boot.test_spring_boot.entities.User;
import com.test_spring_boot.test_spring_boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("/user")
public class UserRestController {

    @Autowired
    UserService userService;

    @RequestMapping(path = "allUsers", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(path = "auth/register", method = RequestMethod.POST)
    public User saveUser(User user){
        return userService.saveUser(user);
    }

    @RequestMapping(path = "getUser/{id}", method = RequestMethod.GET)
    public User findUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

}
