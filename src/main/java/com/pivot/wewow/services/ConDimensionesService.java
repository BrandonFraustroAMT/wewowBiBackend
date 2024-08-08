package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.ConDimensiones;
import com.pivot.wewow.repositories.ConDimensionesRepository;

@Service
public class ConDimensionesService implements IConDimensionesService{
    @Autowired
    private ConDimensionesRepository conDimensionesRepository;

    @Override
    public List<ConDimensiones> getAll() {
        return (List<ConDimensiones>) conDimensionesRepository.findAll();
    }
    
}
