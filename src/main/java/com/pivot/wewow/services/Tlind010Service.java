package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Tlind010;
import com.pivot.wewow.repositories.Tlind010Repository;

@Service
public class Tlind010Service implements ITlind010Service{
    @Autowired
    private Tlind010Repository tRepository;

    @Override
    public List<Tlind010> getAll() {
        return (List<Tlind010>) tRepository.findAll();
    }
    
}
