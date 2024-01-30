package com.learn.Services;

import com.learn.Models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {
    List<User> list=new ArrayList<>();

    public UserService() {
       list.add(new User("ewtr","yurr","utu5t"));
       list.add(new User("khky","qwe","ert"));
    }
    //Get AllUsers
    public List<User> getAllUsers(){

        return this.list;
    }
    //Get Single Users
    public User getUser(String username){
        return this.list.stream().filter((user)-> user.getUsername()
                .equals(username)).findAny().orElse(null);
    }
    //Add new User
    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
