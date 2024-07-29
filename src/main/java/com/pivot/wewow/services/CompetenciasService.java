package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Competencias;
import com.pivot.wewow.repositories.CompetenciasRepository;

@Service
public class CompetenciasService implements ICompetenciasService{
    @Autowired
    private CompetenciasRepository cRepository;

    @Override
    public List<Competencias> getAll() {
        return (List<Competencias>) cRepository.findAll();
    }
    
}
