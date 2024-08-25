package com.pivot.wewow.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.EmpresasModulosSub;
import com.pivot.wewow.services.EmpresasModulosSubService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class EmpresasModulosSubController {
    @Autowired
    private EmpresasModulosSubService eModulosSubService;

    private static final Logger logger = LoggerFactory.getLogger(EmpresasModulosSubController.class);

    @GetMapping("/empresasmodulossub")
    public ResponseEntity<?> getAll() {
        try {
            List<EmpresasModulosSub> empresasmodulossub = eModulosSubService.getAll();
            return ResponseEntity.ok(empresasmodulossub);
        } catch(Exception e) {
            logger.error("EmpresasModulosSubController:getAll ", e);
            throw e;
        }
    }
    
}
