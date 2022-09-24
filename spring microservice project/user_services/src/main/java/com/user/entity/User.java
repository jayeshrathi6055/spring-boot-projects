package com.user.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class User {
    private int id;
    private String name;
    private List<Contact> contacts;
    
    public User(int id, String name){
        this.id = id;
        this.name = name;
        this.contacts = new ArrayList<>();
    }
    
    public User(int id, String name, List<Contact> contacts){
        this.id = id;
        this.name = name;
        this.contacts = contacts;
    }
    public User(){}

    public int getid(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public List<Contact> getContact(){
        return this.contacts;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setContact(List<Contact> contact){
        this.contacts = contact;
    }
}
