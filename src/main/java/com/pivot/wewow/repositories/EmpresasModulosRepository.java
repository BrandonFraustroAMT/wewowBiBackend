package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.pivot.wewow.entities.EmpresasModulos;

@Repository
public interface EmpresasModulosRepository extends CrudRepository<EmpresasModulos, Short>{
    
}
