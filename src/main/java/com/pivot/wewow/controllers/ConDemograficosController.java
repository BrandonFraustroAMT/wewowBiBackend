package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.ConDemograficos;
import com.pivot.wewow.services.ConDemograficosService;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ConDemograficosController {
    @Autowired
    private ConDemograficosService conDemograficosService;

    private static final Logger logger = LoggerFactory.getLogger(ConDemograficosController.class);

    @GetMapping("/condemograficos")
    public ResponseEntity<?> getAll() {
        try {
            List<ConDemograficos> conDemograficos = conDemograficosService.getAll();
            return ResponseEntity.ok(conDemograficos);
        } catch(Exception e) {
            logger.error("ConDemograficosController:getAll ", e);
            throw e;
        }
    }
    
}
