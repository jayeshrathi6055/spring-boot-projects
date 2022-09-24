package com.contact.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Contact {
    private int id;
    private String name;
    private String email;
    
    public Contact(int id, String name, String email){
        this.id = id;
        this.name = name;
    }
    public Contact(){}

    public int getid(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email){
        this.email = email;
    }
}
