package com.pivot.wewow.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.EmpresasModulosSub;
import com.pivot.wewow.services.EmpresasModulosSubService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class EmpresasModulosSubController {
    @Autowired
    private EmpresasModulosSubService eModulosSubService;

    @GetMapping("/empresasmodulossub")
    public ResponseEntity<?> getAll() {
            List<EmpresasModulosSub> empresasmodulossub = eModulosSubService.getAll();
            return ResponseEntity.ok(empresasmodulossub);
    }
    
}
