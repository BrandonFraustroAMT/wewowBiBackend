package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Bdbd010;
import com.pivot.wewow.repositories.Bdbd010Repository;

@Service
public class Bdbd010Service implements IBdbd010Service{
    @Autowired
    private Bdbd010Repository bdbd010Repository;

    @Override
    public List<Bdbd010> getAll() {
        return (List<Bdbd010>) bdbd010Repository.findAll();
    }

    public List<Bdbd010> getBdbd010s(Long empid) {
        return bdbd010Repository.getBdbd010ByEmp(empid);
    }
    
    
}
