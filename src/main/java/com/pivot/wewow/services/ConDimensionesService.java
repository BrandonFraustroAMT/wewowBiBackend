package com.pivot.wewow.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.dto.DimensionesDTO;
import com.pivot.wewow.entities.ConDimensiones;
import com.pivot.wewow.repositories.ConDimensionesRepository;

@Service
public class ConDimensionesService implements IConDimensionesService{
    @Autowired
    private ConDimensionesRepository conDimensionesRepository;

    private static final Logger logger = LoggerFactory.getLogger(ConDimensionesService.class);

    @Override
    public List<ConDimensiones> getAll() {
        return (List<ConDimensiones>) conDimensionesRepository.findAll();
    }

    public List<DimensionesDTO> getDataDimensions(Long empid) {
        try {
            return conDimensionesRepository.findDataDimensions(empid);
        } catch(Exception e) {
            logger.error("ConDimensionesService:getDataDimensions ", e);
            throw e;
        }
    }
    
}
