package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Paquetes;

@Repository
public interface PaquetesRepository extends CrudRepository<Paquetes, Short>{
    
}
