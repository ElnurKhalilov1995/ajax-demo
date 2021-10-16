package com.example.demo.ajax.service;

import com.example.demo.ajax.dao.repository.ContactRepository;
import com.example.demo.ajax.mapper.ContactMapper;
import com.example.demo.ajax.model.ContactDto;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    private final ContactRepository contactRepository;
    private final ContactMapper contactMapper;

    public ContactService(ContactRepository contactRepository, ContactMapper contactMapper) {
        this.contactRepository = contactRepository;
        this.contactMapper = contactMapper;
    }

    public boolean saveContact(ContactDto contactDto) {
        contactRepository.save(contactMapper.mapDtoToEntity(contactDto));
        return true;
    }
}
