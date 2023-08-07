package com.cafeteira.cafeteira.controllers;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
// @RequestMapping("/capsula/update/{capsulaId}")
public class CapsulaController {
    final CapsulaService capsulaService;

    public CapsulaController(CapsulaService capsulaService) {
        this.capsulaService = capsulaService;
    }


    /////Teste = [ ] 

    @RequestMapping("/capsula/updateCapsulaQuantidade/{capsulaId}")
    @PatchMapping
    public ResponseEntity<Object> updateCapsulaQuantidade(@PathVariable Long capsulaId,
            @RequestBody CapsulaDTO capsulaDto) {
        try {
            // var result = new Object();
            // CapsulaModel capsulaModel = new CapsulaModel();

            var capsulaModel = new CapsulaModel();
            capsulaModel.setId(capsulaId);
            capsulaModel.setQuantidade(capsulaDto.getCapsulaQuantidade());

            // var capsulaModel = capsulaService.findById(capsulaId);
            // ((CapsulaModel)
            // capsulaModel).setQuantidade(capsulaDto.getCapsulaQuantidade());

            if (capsulaService.updateQuantidade(capsulaModel.getId(), capsulaModel.getQuantidade()) == 0) {
                throw new Exception("Objeto nao encontrado");
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("Capsula atualizada");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }


    /////Teste = [ ] 

    @RequestMapping("/capsula/getCapsulaByCode/{barcode}")
    @GetMapping
    public ResponseEntity<Object> getCapsulaByCode(@PathVariable String barcode) {
        try {
            var capsulaModel = new CapsulaModel();

            BeanUtils.copyProperties(capsulaService.findBarcode(barcode), capsulaModel);

            if (capsulaModel != null) {
                return ResponseEntity.status(HttpStatus.FOUND).body(capsulaModel);
            }
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(capsulaModel);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }


    /////Teste = [ ] 

    @RequestMapping("/capsula/getCapsulaList")
    @GetMapping
    public ResponseEntity<Object> getCapsulaList() {
        try {
            var result = capsulaService.getCapsulaList();

            return ResponseEntity.status(HttpStatus.FOUND).body(result);

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }

    
    /////Teste = [ ] 

    @RequestMapping("/capsula/updateCapsulaCode/{capsulaId}")
    @PatchMapping
    public ResponseEntity<Object> updateCapsulaCode(@PathVariable Long capsulaId,
            @RequestBody String barcode) {
        try {

            var capsulaModel = new CapsulaModel();
            capsulaModel.setId(capsulaId);
            capsulaModel.setBarcode(barcode);

            if (capsulaService.updateBarcode(capsulaModel.getId(), capsulaModel.getBarcode()) == 0) {
                throw new Exception("Objeto nao encontrado");
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("Capsula atualizada");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }


    /////Teste = [ ] 
    
    @RequestMapping("/capsula/updateCapsulaLimite/{capsulaId}")
    @PatchMapping
    public ResponseEntity<Object> updateCapsulaLimite(@PathVariable Long capsulaId, @RequestBody int capsulaLimite) {
        try {

            var capsulaModel = new CapsulaModel();
            capsulaModel.setId(capsulaId);
            capsulaModel.setLimite(capsulaLimite);

            if (capsulaService.updateCapsulaLimite(capsulaModel.getId(), capsulaModel.getLimite()) == 0) {
                throw new Exception("Objeto nao encontrado");
            }
            return ResponseEntity.status(HttpStatus.CREATED).body("Capsula atualizada");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }

}
