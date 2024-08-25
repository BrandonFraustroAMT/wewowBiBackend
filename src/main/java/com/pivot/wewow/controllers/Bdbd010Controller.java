package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static final Logger logger = LoggerFactory.getLogger(Bdbd010Controller.class);

    @GetMapping("/bdbd010")
    public ResponseEntity<?> getAll() {
        try {
            List<Bdbd010> bdbd010s = bdbd010Service.getAll();
            return ResponseEntity.ok(bdbd010s);
        } catch(Exception e) {
            logger.error("Bdbd010Controller:getAll ", e);
            throw e;
        }
    }

    @GetMapping("/bdbd010/{empid}")
    public ResponseEntity<?> getBdbd010Data(@PathVariable Long empid) {
        try {
            List<Bdbd010> bdbd010s = bdbd010Service.getBdbd010s(empid);
            return ResponseEntity.ok(bdbd010s);
        } catch(Exception e) {
            logger.error("Bdbd010Controller:getBdbd010Data ", e);
            throw e;
        }
    }
    
    
}
