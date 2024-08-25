package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(BdinfController.class);

    @GetMapping("/bdinf")
    public ResponseEntity<?> getAll() {
        try {
            List<Bdinf> bdinfs = bdinfService.getAll();
            return ResponseEntity.ok(bdinfs);
        } catch(Exception e) {
            logger.error("BdinfController:getAll ", e);
            throw e;
        }
    }

    @GetMapping("/bdinf/{empid}")
    public ResponseEntity<?> getAnswersEmpID(@PathVariable Long empid) {
        try {
            List<Bdinf> bdinfs = bdinfService.getAnswersEmpID(empid);
            return ResponseEntity.ok(bdinfs);
        } catch(Exception e) {
            logger.error("BdinfController:getAnswersEmpID ", e);
            throw e;
        }
    }
    
}
