package com.user.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.user.entity.Contact;
import com.user.entity.User;

@Service
public class UserImplement implements UserInterface{
    private List<User> users = new ArrayList<>();

    private UserImplement(){
        users.add(new User(100, "Tarun"));
        users.add(new User(101, "Varun"));
    }
    public User getUserByUserId(long userId){
        String url = "http://localhost:9001/contact/"+userId;
        RestTemplate restTemplate = new RestTemplate();
        List<Contact> contact = restTemplate.getForObject(url, List.class);
        for(User el: users){
            if(el.getid()==userId){
                el.setContact(contact);
                return el;
            }
        }
        return new User();
    }
}
