package com.pivot.wewow.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pivot.wewow.entities.Idiomas;
import com.pivot.wewow.services.IIdiomasService;

@RestController
@RequestMapping("/api")
public class IdiomasController {
    @Autowired
    private IIdiomasService idiomasService;

    private static final Logger logger = LoggerFactory.getLogger(IdiomasController.class);

    @GetMapping("/idiomas")
    public List<Idiomas> getAll() {
        try {
            return idiomasService.getAll();
        } catch(Exception e) {
            logger.error("IdiomasController:getAll ", e);
            throw e;
        }
    }
}
