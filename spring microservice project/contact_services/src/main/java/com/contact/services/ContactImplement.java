package com.contact.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactImplement implements ContactInterface {
    private List<Contact> contacts = new ArrayList<>();
    private ContactImplement(){
        contacts.add(new Contact(100, "atul", "atul@gmail.com"));
        contacts.add(new Contact(100, "mrudul", "mrudul@gmail.com"));
        contacts.add(new Contact(101, "ria", "ria@gmail.com"));
        contacts.add(new Contact(101, "priya", "priya@gmail.com"));
    }

    public List<Contact> getContactByUserId(long userId){
        List<Contact> contact = new ArrayList<>();
        for(Contact el:this.contacts){
            if(el.getid()==userId){
                contact.add(el);
            }
        }
        return contact;
    }
}
