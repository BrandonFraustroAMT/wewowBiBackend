package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(CompetenciasController.class);

    @GetMapping("/competencias")
    public ResponseEntity<?> getAll() {
        try {
            List<Competencias> competencias = cService.getAll();
            return ResponseEntity.ok(competencias);
        } catch(Exception e) {
            logger.error("CompetenciasController:getAll ", e);
            throw e;
        }
    }
    
}
