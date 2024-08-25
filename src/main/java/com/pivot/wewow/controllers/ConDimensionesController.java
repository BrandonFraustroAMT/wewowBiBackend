package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.dto.DimensionesDTO;
import com.pivot.wewow.entities.ConDimensiones;
import com.pivot.wewow.services.ConDimensionesService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/api")
public class ConDimensionesController {
    @Autowired
    private ConDimensionesService conDimensionesService;

    private static final Logger logger = LoggerFactory.getLogger(ConDimensionesController.class);

    @GetMapping("/condimensiones")
    public ResponseEntity<?> getAll() {
        try {
            List<ConDimensiones> conDimensiones = conDimensionesService.getAll();
            return ResponseEntity.ok(conDimensiones);
        } catch(Exception e) {
            logger.error("ConDimensionesController:getAll ", e);
            throw e;
        }
    }

    @GetMapping("/condimensiones/{empid}")
    public ResponseEntity<?> getDimensions(@PathVariable Long empid) {
        try {
            List<DimensionesDTO> lObjects = conDimensionesService.getDataDimensions(empid);
            return ResponseEntity.ok(lObjects);
        } catch(Exception e) {
            logger.error("ConDimensionesController:getDimensions ", e);
            throw e;
        }
    }
    
    
}
