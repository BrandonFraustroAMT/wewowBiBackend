package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.ConDimensiones;
import com.pivot.wewow.services.ConDimensionesService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class ConDimensionesController {
    @Autowired
    private ConDimensionesService conDimensionesService;

    @GetMapping("/condimensiones")
    public ResponseEntity<?> getAll() {
        List<ConDimensiones> conDimensiones = conDimensionesService.getAll();
        return ResponseEntity.ok(conDimensiones);
    }
    
}
