package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Competencias;
import com.pivot.wewow.services.CompetenciasService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class CompetenciasController {
    @Autowired
    private CompetenciasService cService;

    @GetMapping("/competencias")
    public ResponseEntity<?> getAll() {
        List<Competencias> competencias = cService.getAll();
        return ResponseEntity.ok(competencias);
    }
    
}
