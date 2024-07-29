package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.CompetenciasId;
import com.pivot.wewow.entities.Twwdimcompsubcomp;

@Repository
public interface TwwdimcompsubcompReposiroty extends CrudRepository<Twwdimcompsubcomp, CompetenciasId>{
    
}
