package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.EmpresasModulos;
import com.pivot.wewow.services.EmpresasModulosService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class EmpresasModulosController {
    @Autowired
    private EmpresasModulosService eService;

    private static final Logger logger = LoggerFactory.getLogger(EmpresasModulosController.class);

    @GetMapping("/empresasmodulos")
    public ResponseEntity<?> getAll() {
        try {
            List<EmpresasModulos> eModulos = eService.getAll();
        return ResponseEntity.ok(eModulos);
        } catch(Exception e) {
            logger.error("EmpresasModulosController:getAll ", e);
            throw e;
        }
    }
    
}
