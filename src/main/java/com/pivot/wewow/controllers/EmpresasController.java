package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Empresas;
import com.pivot.wewow.services.EmpresasService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class EmpresasController {
    @Autowired
    private EmpresasService eService;

    @GetMapping("/empresas")
    public ResponseEntity<?> getAll() {
        List<Empresas> empresas = eService.getAll();
        return ResponseEntity.ok(empresas);
    }
    
}
