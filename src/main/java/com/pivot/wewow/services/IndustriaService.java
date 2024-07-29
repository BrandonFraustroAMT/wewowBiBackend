package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Industra;
import com.pivot.wewow.repositories.IndustriaRepository;

@Service
public class IndustriaService implements IIndustriaService{
    @Autowired
    private IndustriaRepository iRepository;

    @Override
    public List<Industra> getAll() {
        return (List<Industra>) iRepository.findAll();
    }
    
}
