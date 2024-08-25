package com.pivot.wewow.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Bdbd010;
import com.pivot.wewow.repositories.Bdbd010Repository;

@Service
public class Bdbd010Service implements IBdbd010Service{
    @Autowired
    private Bdbd010Repository bdbd010Repository;

    private static final Logger logger = LoggerFactory.getLogger(Bdbd010Service.class);

    @Override
    public List<Bdbd010> getAll() {
        try{
            return (List<Bdbd010>) bdbd010Repository.findAll();
        } catch(Exception e) {
            logger.error("Bdbd010Service:getAll ", e);
            throw e;
        }
    }

    public List<Bdbd010> getBdbd010s(Long empid) {
        try {
            return bdbd010Repository.getBdbd010ByEmp(empid);
        } catch (Exception e) {
            logger.error("Bdbd010Service:getBdbd010s ", e);
            throw e;
        }
    }
    
    
}
