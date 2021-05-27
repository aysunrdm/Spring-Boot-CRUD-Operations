package com.aysunerdem.springbootcrud.controller;

import com.aysunerdem.springbootcrud.model.Developer;
import com.aysunerdem.springbootcrud.service.DeveloperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value="/api")
public class DeveloperController {

    @Autowired
    DeveloperService developerService;

    @PostMapping("/save")
    public Developer save(@RequestBody Developer developer){

        developerService.saveOrUpdate(developer);
        return developer;
    }

    @PutMapping("/update")
    public String update(@RequestBody Developer developer){

        developerService.saveOrUpdate(developer);
        return "Updated successfully...";
    }

    @GetMapping("/list")
    public List<Developer> list(){
        return developerService.getAllDeveloper();
    }

    @GetMapping("/list/{id}")
    public Developer getById(@PathVariable Long id){

        return developerService.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDeveloper(@PathVariable Long id){

        developerService.deleteDeveloper(id);
        return "Deleted successfully id= " + id;
    }

}
