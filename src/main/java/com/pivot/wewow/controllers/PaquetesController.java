package com.pivot.wewow.controllers;

import java.util.List;

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

    @GetMapping("/paquetes")
    public ResponseEntity<?> getAll() {
        List<Paquetes> paquetes = pService.getAll();
        return ResponseEntity.ok(paquetes);
    }
    
}
