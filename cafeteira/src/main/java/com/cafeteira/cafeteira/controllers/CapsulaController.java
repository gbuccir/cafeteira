package com.cafeteira.cafeteira.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafeteira.cafeteira.dtos.CapsulaDTO;
import com.cafeteira.cafeteira.models.CapsulaModel;
import com.cafeteira.cafeteira.services.CapsulaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/capsula/update/{capsulaId}")
public class CapsulaController {
    final CapsulaService capsulaService;

    public CapsulaController(CapsulaService capsulaService) {
        this.capsulaService = capsulaService;
    }

    // @PutMapping
    @PatchMapping
    public ResponseEntity<Object> updateCapsula(@PathVariable Long capsulaId, @RequestBody CapsulaDTO capsulaDto) {
        try {
            //var result = new Object();
            //CapsulaModel capsulaModel = new CapsulaModel();

            var capsulaModel = new CapsulaModel();
            capsulaModel.setId(capsulaId);
            capsulaModel.setQuantidade(capsulaDto.getCapsulaQuantidade());

            // var capsulaModel = capsulaService.findById(capsulaId);
            // ((CapsulaModel) capsulaModel).setQuantidade(capsulaDto.getCapsulaQuantidade());

            if(capsulaService.updateQuantidade(capsulaModel.getId(), capsulaModel.getQuantidade()) == 0){
                throw new Exception("Objeto nao encontrado");
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("Capsula atualizada");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }

    // private CapsulaModel findCapsulaById(Long capsulaId){
    //     return capsulaService.findById(capsulaId);
    // }

}
