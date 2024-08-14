package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.dto.LideresDTO;
import com.pivot.wewow.entities.ConLideres;
import com.pivot.wewow.services.ConLideresService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api")
public class ConLideresController {
    @Autowired
    private ConLideresService conLideresService;

    @GetMapping("/conlideres")
    public ResponseEntity<?> getAll() {
        List<ConLideres> conLideres = conLideresService.getAll();
        return ResponseEntity.ok(conLideres);
    }
    @GetMapping("/conlideres/{empid}")
    public ResponseEntity<?> getLideresByID(@PathVariable Long empid) {
        List<LideresDTO> lideresDTOs = conLideresService.getLideres(empid);
        return ResponseEntity.ok(lideresDTOs);
    }
    
}
