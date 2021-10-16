package com.example.demo.ajax.controller;

import com.example.demo.ajax.model.ContactDto;
import com.example.demo.ajax.service.ContactService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contact")
public class ContactRestController {
    private final ContactService contactService;

    public ContactRestController(ContactService contactService) {
        this.contactService = contactService;
    }

    @PostMapping("/")
    public void saveContact(@RequestBody ContactDto contactDto) {
        contactService.saveContact(contactDto);
    }
}
