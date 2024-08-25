package com.pivot.wewow.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.dto.LideresDTO;
import com.pivot.wewow.entities.ConLideres;
import com.pivot.wewow.repositories.ConLideresRepository;

@Service
public class ConLideresService implements IConLideresService{
    @Autowired
    private ConLideresRepository conLideresRepository;

    private static final Logger logger = LoggerFactory.getLogger(ConLideresService.class);

    @Override
    public List<ConLideres> getAll() {
        return (List<ConLideres>) conLideresRepository.findAll();
    }

    public List<LideresDTO> getLideres(Long empid) {
        try {
            return conLideresRepository.findDataLideres(empid);
        } catch(Exception e) {
            logger.error("ConLideresService:getLideres ", e);
            throw e;
        }
    }
    
}
