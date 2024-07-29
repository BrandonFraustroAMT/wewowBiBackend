package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Competencias;
import com.pivot.wewow.entities.CompetenciasId;

@Repository
public interface CompetenciasRepository extends CrudRepository<Competencias, CompetenciasId> {
    
}
