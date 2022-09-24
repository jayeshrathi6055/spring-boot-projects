package com.contact.services;

import java.util.List;

import com.contact.entity.Contact;

public interface ContactInterface {
    public List<Contact> getContactByUserId(long userId);
}
