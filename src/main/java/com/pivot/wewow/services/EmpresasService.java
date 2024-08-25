package com.pivot.wewow.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Empresas;
import com.pivot.wewow.repositories.EmpresasRepository;

@Service
public class EmpresasService implements IEmpresasService{
    @Autowired
    private EmpresasRepository eRepository;

    private static final Logger logger = LoggerFactory.getLogger(EmpresasService.class);

    @Override
    public List<Empresas> getAll() {
        return (List<Empresas>) eRepository.findAll();
    }

    @Override
    public Empresas getById(Long id) {
        try {
            return eRepository.findById(id).get();
        } catch(Exception e) {
            logger.error("EmpresasService:getById ", e);
            throw e;
        }
    }
    
}
