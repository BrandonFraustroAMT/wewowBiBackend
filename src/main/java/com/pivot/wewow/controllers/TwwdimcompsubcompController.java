package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Twwdimcompsubcomp;
import com.pivot.wewow.services.TwwdimcompsubcompService;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api")
public class TwwdimcompsubcompController {
    @Autowired 
    TwwdimcompsubcompService tService;

    private static final Logger logger = LoggerFactory.getLogger(TwwdimcompsubcompController.class);

    @GetMapping("/twwdimcompsubcomp")
    public ResponseEntity<?> getAll() {
        try {
            List<Twwdimcompsubcomp> twwdimcompsubcomp = tService.getAll();
            return ResponseEntity.ok(twwdimcompsubcomp);
        } catch(Exception e) {
            logger.error("TwwdimcompsubcompController:getAll ", e);
            throw e;
        }
    }
    
}
