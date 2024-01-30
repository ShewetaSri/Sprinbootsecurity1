package com.learn.Controllers;

import com.learn.Models.User;
import com.learn.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UseController {
    @Autowired
    private UserService userService;
    //All users
    @GetMapping("/")
    public List<User> getAllUsers(){
        return this.userService.getAllUsers();
    }
    //Return Single User
    @GetMapping("/{username}")
    public User gerUser(@PathVariable("username") String username){
        return this.userService.getUser(username);
    }
    //Add user
    @PostMapping("/")
    public User add(@RequestBody User user){
        return this.userService.addUser(user);
    }
}
