package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.ConLideres;
import com.pivot.wewow.entities.ConLideresId;

@Repository
public interface ConLideresRepository extends CrudRepository<ConLideres, ConLideresId>{
    
}
