package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Idiomas;
import com.pivot.wewow.repositories.IdiomasRepository;

@Service
public class IdiomasService implements IIdiomasService{
    @Autowired
    private IdiomasRepository idiomasRepository;

    @Override
    public List<Idiomas> getAll() {
        return (List<Idiomas>) idiomasRepository.findAll();
    }
}
