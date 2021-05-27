package com.aysunerdem.springbootcrud.repository;

import com.aysunerdem.springbootcrud.model.Developer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DeveloperRepository extends CrudRepository<Developer, Long>
{

}
