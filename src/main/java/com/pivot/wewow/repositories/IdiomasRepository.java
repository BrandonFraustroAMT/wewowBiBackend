package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Idiomas;

@Repository
public interface IdiomasRepository extends CrudRepository<Idiomas, Short>{
    
}
