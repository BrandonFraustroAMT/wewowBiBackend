package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Bdinf;
import com.pivot.wewow.entities.BdinfId;

@Repository
public interface BdinfRepository extends CrudRepository<Bdinf, BdinfId>{
    
}
