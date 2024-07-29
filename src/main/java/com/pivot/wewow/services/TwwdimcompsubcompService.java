package com.pivot.wewow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pivot.wewow.entities.Twwdimcompsubcomp;
import com.pivot.wewow.repositories.TwwdimcompsubcompReposiroty;

@Service
public class TwwdimcompsubcompService implements ITwwdimcompsubcompService{
    @Autowired
    private TwwdimcompsubcompReposiroty tReposiroty;

    @Override
    public List<Twwdimcompsubcomp> getAll() {
        return (List<Twwdimcompsubcomp>) tReposiroty.findAll();
    }
    
}
