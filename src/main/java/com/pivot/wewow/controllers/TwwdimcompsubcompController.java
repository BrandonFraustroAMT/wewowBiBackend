package com.pivot.wewow.controllers;

import java.util.List;

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
    @Autowired TwwdimcompsubcompService tService;

    @GetMapping("/twwdimcompsubcomp")
    public ResponseEntity<?> getAll() {
        List<Twwdimcompsubcomp> twwdimcompsubcomp = tService.getAll();
        return ResponseEntity.ok(twwdimcompsubcomp);
    }
    
}
