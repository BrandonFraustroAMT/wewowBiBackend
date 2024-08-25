package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Paquetes;
import com.pivot.wewow.services.PaquetesService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class PaquetesController {
    @Autowired
    private PaquetesService pService;

    private static final Logger logger = LoggerFactory.getLogger(PaquetesController.class);

    @GetMapping("/paquetes")
    public ResponseEntity<?> getAll() {
        try {
            List<Paquetes> paquetes = pService.getAll();
            return ResponseEntity.ok(paquetes);
        } catch(Exception e) {
            logger.error("PaquetesController:getAll ", e);
            throw e;
        }
    }
    
}
