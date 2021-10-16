package com.example.demo.ajax.dao.repository;

import com.example.demo.ajax.dao.entity.ContactUs;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<ContactUs, Long> {
}
