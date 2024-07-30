package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.EmpresasModulosSub;

@Repository
public interface EmpresasModulosSubRepository extends CrudRepository<EmpresasModulosSub, Short>{
    
}
