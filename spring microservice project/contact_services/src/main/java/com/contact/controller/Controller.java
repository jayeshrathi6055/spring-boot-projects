package com.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.contact.services.ContactImplement;
import com.contact.entity.Contact;

@RestController
@RequestMapping("/contact")
public class Controller {
    @Autowired
    private ContactImplement ContactImplement;

    @GetMapping("/{userId}")
    public List<Contact> getContactByUserId(@PathVariable String userId){
        return this.ContactImplement.getContactByUserId(Long.parseLong(userId));
    }
}
