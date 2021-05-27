package com.aysunerdem.springbootcrud.service;

import com.aysunerdem.springbootcrud.model.Developer;
import com.aysunerdem.springbootcrud.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service("developerService")
@Transactional
public class DeveloperServiceImpl implements DeveloperService {

    @Autowired
    DeveloperRepository developerRepository;

    @Override
    public List<Developer> getAllDeveloper() {
        return (List<Developer>) developerRepository.findAll();
    }

    @Override
    public Developer getById(Long id) {

        return developerRepository.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Developer developer) {

        developerRepository.save(developer);
    }

    @Override
    public void deleteDeveloper(Long id) {

        developerRepository.deleteById(id);
    }
}
