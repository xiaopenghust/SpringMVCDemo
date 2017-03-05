package com.sharp.controller;

import com.sharp.domain.User;
import com.sharp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 584003 on 2017/3/3.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/queryUsers")
    private List<User> findUsers(){
        return userService.queryUsers();
    }

    @PostMapping("/saveUser")
    private String saveUser(@RequestBody User user){
        userService.save(user);
        return "success";
    }

    @GetMapping("/removeUser/{id}")
    private String removeUser(@PathVariable("id") Integer id){
        userService.remove(id);
        return "success";
    }

    @PostMapping("/updateUser")
    private String updateUser(@RequestBody User user){
        userService.update(user);
        return "success";
    }
}
