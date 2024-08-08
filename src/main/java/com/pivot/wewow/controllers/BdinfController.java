package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Bdinf;
import com.pivot.wewow.services.BdinfService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class BdinfController {
    @Autowired
    private BdinfService bdinfService;

    @GetMapping("/bdinf")
    public ResponseEntity<?> getAll() {
        List<Bdinf> bdinfs = bdinfService.getAll();
        return ResponseEntity.ok(bdinfs);
    }

    @GetMapping("/bdinf/{empid}")
    public ResponseEntity<?> getAnswersEmpID(@PathVariable Long empid) {
        List<Bdinf> bdinfs = bdinfService.getAnswersEmpID(empid);
        return ResponseEntity.ok(bdinfs);
    }
    
}
