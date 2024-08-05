package com.pivot.wewow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.pivot.wewow.entities.Tlind010;
import com.pivot.wewow.entities.Tlind010Id;

@Repository
public interface Tlind010Repository extends CrudRepository<Tlind010, Tlind010Id>{
    
}
