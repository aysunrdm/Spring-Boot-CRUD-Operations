package com.aysunerdem.springbootcrud.service;

import com.aysunerdem.springbootcrud.model.Developer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DeveloperService {

    List<Developer> getAllDeveloper();

    Developer getById(Long id);

    void saveOrUpdate(Developer developer);

    void deleteDeveloper(Long id);

}
