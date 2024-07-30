package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Bdinf;
import com.pivot.wewow.repositories.BdinfRepository;

@Service
public class BdinfService implements IBdinfService{
    @Autowired
    private BdinfRepository bRepository;
    
    @Override
    public List<Bdinf> getAll() {
        return (List<Bdinf>) bRepository.findAll();
    }
    
}
