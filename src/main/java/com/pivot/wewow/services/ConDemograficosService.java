package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.ConDemograficos;
import com.pivot.wewow.repositories.ConDemograficosRepository;

@Service
public class ConDemograficosService implements IConDemograficosService{
    @Autowired
    private ConDemograficosRepository conDemograficosRepository;

    @Override
    public List<ConDemograficos> getAll() {
        return (List<ConDemograficos>) conDemograficosRepository.findAll();
    }
    
}
