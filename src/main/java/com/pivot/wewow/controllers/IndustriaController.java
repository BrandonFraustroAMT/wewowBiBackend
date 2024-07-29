package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Industra;
import com.pivot.wewow.services.IndustriaService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class IndustriaController {
    @Autowired
    private IndustriaService iService;

    @GetMapping("/industria")
    public ResponseEntity<?> getAll() {
        List<Industra> industras = iService.getAll();
        return ResponseEntity.ok(industras);
    }
    
}
