package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Paquetes;
import com.pivot.wewow.repositories.PaquetesRepository;

@Service
public class PaquetesService implements IPaquetesService{
    @Autowired
    private PaquetesRepository pRepository;

    @Override
    public List<Paquetes> getAll() {
        return (List<Paquetes>) pRepository.findAll();
    }
    
}
