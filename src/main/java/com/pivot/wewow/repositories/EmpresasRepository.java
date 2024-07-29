package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Empresas;

@Repository
public interface EmpresasRepository extends CrudRepository<Empresas, Long>{
    
}
