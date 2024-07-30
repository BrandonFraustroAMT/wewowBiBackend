package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Bdbd010;
import com.pivot.wewow.entities.Bdbd010Id;

@Repository
public interface Bdbd010Repository extends CrudRepository<Bdbd010, Bdbd010Id>{
    
}
