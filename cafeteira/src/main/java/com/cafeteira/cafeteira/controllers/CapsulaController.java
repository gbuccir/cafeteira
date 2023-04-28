package com.cafeteira.cafeteira.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafeteira.cafeteira.services.CapsulaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/capsula")
public class CapsulaController {
    final CapsulaService capsulaService;

    public CapsulaController(CapsulaService capsulaService) {
        this.capsulaService = capsulaService;
    }

    @PutMapping
    public ResponseEntity<Object> updateCapsula(){
        return null;
    }
    
}
