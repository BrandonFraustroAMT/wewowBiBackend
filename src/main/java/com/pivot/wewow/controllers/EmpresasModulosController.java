package com.pivot.wewow.controllers;

import java.util.List;

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

    @GetMapping("/empresasmodulos")
    public ResponseEntity<?> getAll() {
        List<EmpresasModulos> eModulos = eService.getAll();
        return ResponseEntity.ok(eModulos);
    }
    
}
