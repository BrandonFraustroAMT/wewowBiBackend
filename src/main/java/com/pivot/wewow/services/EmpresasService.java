package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Empresas;
import com.pivot.wewow.repositories.EmpresasRepository;

@Service
public class EmpresasService implements IEmpresasService{
    @Autowired
    private EmpresasRepository eRepository;

    @Override
    public List<Empresas> getAll() {
        return (List<Empresas>) eRepository.findAll();
    }

    @Override
    public Empresas getById(Long id) {
        return eRepository.findById(id).get();
    }
    
}
