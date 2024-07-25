package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Dimensiones;
import com.pivot.wewow.services.DimensionesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
public class DimensionesController {
    @Autowired
    private DimensionesService dimensionesService;

    @GetMapping("/dimensiones")
    public ResponseEntity<?> getAll() {
        List<Dimensiones> dList = dimensionesService.getAll();
        return ResponseEntity.ok(dList);
    }
    
}
