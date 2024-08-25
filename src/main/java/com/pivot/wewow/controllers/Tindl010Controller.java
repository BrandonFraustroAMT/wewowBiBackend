package com.pivot.wewow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.dto.Tindl010DTO;
import com.pivot.wewow.entities.Tindl010;
import com.pivot.wewow.services.Tindl010Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class Tindl010Controller {
    @Autowired
    private Tindl010Service tindl010Service;

    @GetMapping("/tindl010")
    public ResponseEntity<?> getAll() {
        List<Tindl010> tindl010s = tindl010Service.getAll();
        return ResponseEntity.ok(tindl010s);
    }

    @GetMapping("/tindl010/{empid}")
    public ResponseEntity<?> getByEmpidAndLindidlinRange(@PathVariable Long empid) {
        List<Tindl010> tindl010s = tindl010Service.getByEmpidAndLindidlinRange(empid);
        return ResponseEntity.ok(tindl010s);
    }

    @GetMapping("/tindl010/dimensions/{empid}")
    public ResponseEntity<?> getDataDimensions(@PathVariable Long empid) {
        List<Tindl010DTO> results = tindl010Service.getDataDimensions(empid);
        return ResponseEntity.ok(results);
    }
    /* @GetMapping("/tindl010/dimensions/{empid}")
    public ResponseEntity<?> getDataDimensions(@PathVariable Long empid) {
        List<Object[]> results = tindl010Service.getDataDimensions(empid);
        return ResponseEntity.ok(results);
    } */
    
    
}
