package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.EmpresasModulosSub;
import com.pivot.wewow.repositories.EmpresasModulosSubRepository;

@Service
public class EmpresasModulosSubService implements IEmpresasModulosSubService{
    @Autowired
    private EmpresasModulosSubRepository eModulosSubRepository;

    @Override
    public List<EmpresasModulosSub> getAll() {
        try {
            System.out.println("Datos: " +eModulosSubRepository.findAll());
            return (List<EmpresasModulosSub>) eModulosSubRepository.findAll();
        } catch (Exception e) {
            System.out.println("Error " + e);
            return null;
        }
    }
    
}
