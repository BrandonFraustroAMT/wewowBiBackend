package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Dimensiones;
import com.pivot.wewow.repositories.DimensionesRepository;

@Service
public class DimensionesService implements IDimensionesService{
    @Autowired
    private DimensionesRepository dimensionesRepository;
    @Override
    public List<Dimensiones> getAll() {
        return (List<Dimensiones>) dimensionesRepository.findAll();
    }
    
}
