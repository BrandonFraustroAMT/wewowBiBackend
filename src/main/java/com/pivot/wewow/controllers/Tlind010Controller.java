package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Tlind010;
import com.pivot.wewow.services.Tlind010Service;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/api")
public class Tlind010Controller {
    @Autowired
    private Tlind010Service tService;

    private static final Logger logger = LoggerFactory.getLogger(Tlind010Controller.class);

    @GetMapping("/tlind010")
    public ResponseEntity<?> getAll() {
        try {
            List<Tlind010> tList = tService.getAll();
            return ResponseEntity.ok(tList);
        } catch(Exception e) {
            logger.error("Tlind010Controller:getAll ", e);
            throw e;
        }
    }
    
}
