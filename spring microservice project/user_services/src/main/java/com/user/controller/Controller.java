package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.services.UserImplement;

@RestController
@RequestMapping("/user")
public class Controller {
    @Autowired   
    private UserImplement UserImplement;

    @GetMapping("/{userId}")
    public User getUserByUserId(@PathVariable String userId){
        return this.UserImplement.getUserByUserId(Long.parseLong(userId));
    }
}
