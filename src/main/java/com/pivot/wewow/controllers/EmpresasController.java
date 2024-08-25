package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Empresas;
import com.pivot.wewow.services.EmpresasService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class EmpresasController {
    @Autowired
    private EmpresasService eService;

    private static final Logger logger = LoggerFactory.getLogger(EmpresasController.class);

    @GetMapping("/empresas")
    public ResponseEntity<?> getAll() {
        try {
            List<Empresas> empresas = eService.getAll();
            return ResponseEntity.ok(empresas);
        } catch(Exception e) {
            logger.error("EmpresasController:getAll ", e);
            throw e;
        }
    }

    @GetMapping("/empresas/{empid}")
    public ResponseEntity<Empresas> getEmpresa(@PathVariable Long empid) {
        try {
            Empresas empresa = eService.getById(empid);
            if (empresa != null) {
                return ResponseEntity.ok(empresa);
            }
            return ResponseEntity.notFound().build();
        } catch (Exception e) {
            logger.error("EmpresasController:getAll ", e);
            throw e;
        }
    }
    
    
}
