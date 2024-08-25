package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(ConLideresController.class);

    @GetMapping("/conlideres")
    public ResponseEntity<?> getAll() {
        try {
            List<ConLideres> conLideres = conLideresService.getAll();
            return ResponseEntity.ok(conLideres);
        } catch(Exception e) {
            logger.error("ConLideresController:getAll ", e);
            throw e;
        }
    }
    @GetMapping("/conlideres/{empid}")
    public ResponseEntity<?> getLideresByID(@PathVariable Long empid) {
        try {
            List<LideresDTO> lideresDTOs = conLideresService.getLideres(empid);
            return ResponseEntity.ok(lideresDTOs);
        } catch(Exception e) {
            logger.error("ConLideresController:getLideresByID ", e);
            throw e;
        }
    }
    
}
