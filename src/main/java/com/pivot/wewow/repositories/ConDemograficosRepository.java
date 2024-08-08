package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.ConDemograficos;
import com.pivot.wewow.entities.ConDemograficosId;

@Repository
public interface ConDemograficosRepository extends CrudRepository<ConDemograficos, ConDemograficosId>{
    
}
