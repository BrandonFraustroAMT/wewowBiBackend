package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Industra;

@Repository
public interface IndustriaRepository extends CrudRepository<Industra, Short>{
    
}
