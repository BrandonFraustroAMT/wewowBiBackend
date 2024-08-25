package com.pivot.wewow.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.dto.Tindl010DTO;
import com.pivot.wewow.entities.Tindl010;
import com.pivot.wewow.repositories.Tindl010Repository;

@Service
public class Tindl010Service implements ITindl010Service{
    @Autowired
    private Tindl010Repository tindl010Repository;

    private static final Logger logger = LoggerFactory.getLogger(Tindl010Service.class);

    @Override
    public List<Tindl010> getAll() {
        return (List<Tindl010>) tindl010Repository.findAll();
    }

    public List<Tindl010> getByEmpidAndLindidlinRange(Long empid) {
        try {
            return tindl010Repository.findByEmpidAndLindidlinBetween(empid);
        } catch(Exception e) {
            logger.error("Tindl010Service:getByEmpidAndLindidlinRange ", e);
            throw e;
        }
    }

    public List<Tindl010DTO> getDataDimensions(Long empid) {
        try {
            return tindl010Repository.findDataDimensions(empid);
        } catch(Exception e) {
            logger.error("Tindl010Service:getDataDimensions ", e);
            throw e;
        }
    }
    /* public List<Object[]> getDataDimensions(Long empid) {
        return tindl010Repository.findDataDimensions(empid);
    } */
    
}
