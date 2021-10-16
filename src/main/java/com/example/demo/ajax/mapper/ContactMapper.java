package com.example.demo.ajax.mapper;

import com.example.demo.ajax.dao.entity.ContactUs;
import com.example.demo.ajax.model.ContactDto;
import org.springframework.stereotype.Component;

@Component
public class ContactMapper {

    public ContactUs mapDtoToEntity(ContactDto contactDto) {
        return new ContactUs(
                contactDto.getFirstName(),
                contactDto.getLastName(),
                contactDto.getPhone(),
                contactDto.getEmail(),
                contactDto.getMessage()
        );
    }
}
