package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.ConLideres;
import com.pivot.wewow.repositories.ConLideresRepository;

@Service
public class ConLideresService implements IConLideresService{
    @Autowired
    private ConLideresRepository conLideresRepository;

    @Override
    public List<ConLideres> getAll() {
        return (List<ConLideres>) conLideresRepository.findAll();
    }
    
}
