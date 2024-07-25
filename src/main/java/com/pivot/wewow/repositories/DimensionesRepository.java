package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Dimensiones;

@Repository
public interface DimensionesRepository extends CrudRepository<Dimensiones, Short>{

}
