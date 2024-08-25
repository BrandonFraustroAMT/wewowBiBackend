package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(DimensionesController.class);

    @GetMapping("/dimensiones")
    public ResponseEntity<?> getAll() {
        try {
            List<Dimensiones> dList = dimensionesService.getAll();
            return ResponseEntity.ok(dList);
        } catch(Exception e) {
            logger.error("DimensionesController:getAll ", e);
            throw e;
        }
    }
    
}
