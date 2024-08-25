package com.pivot.wewow.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Bdinf;
import com.pivot.wewow.repositories.BdinfRepository;

@Service
public class BdinfService implements IBdinfService{
    @Autowired
    private BdinfRepository bRepository;

    private static final Logger logger = LoggerFactory.getLogger(BdinfService.class);
    
    @Override
    public List<Bdinf> getAll() {
        return (List<Bdinf>) bRepository.findAll();
    }

    public List<Bdinf> getAnswersEmpID(Long empid) {
        try {
            return bRepository.getAnswersByEmp(empid);
        } catch(Exception e) {
            logger.error("BdinfService:getAnswersEmpID ", e);
            throw e;
        }
    }
    
}
