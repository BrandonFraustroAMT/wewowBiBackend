package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Idiomas;
import com.pivot.wewow.services.IIdiomasService;

@RestController
public class IdiomasController {
    @Autowired
    private IIdiomasService idiomasService;

    @GetMapping("/api/idiomas")
    public List<Idiomas> getAll() {
        return idiomasService.getAll();
    }
}
