package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Bdbd010;
import com.pivot.wewow.services.Bdbd010Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class Bdbd010Controller {
    @Autowired
    private Bdbd010Service bdbd010Service;

    @GetMapping("/bdbd010")
    public ResponseEntity<?> getAll() {
        List<Bdbd010> bdbd010s = bdbd010Service.getAll();
        return ResponseEntity.ok(bdbd010s);
    }

    @GetMapping("/bdbd010/{empid}")
    public ResponseEntity<?> getBdbd010Data(@PathVariable Long empid) {
        List<Bdbd010> bdbd010s = bdbd010Service.getBdbd010s(empid);
        return ResponseEntity.ok(bdbd010s);
    }
    
    
}
