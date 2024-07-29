package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.EmpresasModulos;
import com.pivot.wewow.repositories.EmpresasModulosRepository;

@Service
public class EmpresasModulosService implements IEmpresasModulosService{
    @Autowired
    private EmpresasModulosRepository eRepository;
    @Override
    public List<EmpresasModulos> getAll() {
        return (List<EmpresasModulos>) eRepository.findAll();
    }
    
}
