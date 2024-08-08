package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.ConDemograficosId;
import com.pivot.wewow.entities.ConDimensiones;

@Repository
public interface ConDimensionesRepository extends CrudRepository<ConDimensiones, ConDemograficosId>{
    
}
