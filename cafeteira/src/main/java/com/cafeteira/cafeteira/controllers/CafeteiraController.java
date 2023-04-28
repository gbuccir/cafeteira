package com.cafeteira.cafeteira.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cafeteira.cafeteira.DTOs.CafeteiraDTO;
import com.cafeteira.cafeteira.models.CafeteiraModel;
import com.cafeteira.cafeteira.models.CafeteiraTipoCapsulaModel;
import com.cafeteira.cafeteira.services.CafeteiraService;
import com.cafeteira.cafeteira.services.CafeteiraTpCapsulaService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/cafeteira")
public class CafeteiraController {
    final CafeteiraService cafeteiraService;
    final CafeteiraTpCapsulaService cafeteiraTpCapsulaService;

    public CafeteiraController(CafeteiraService cafeteiraService, CafeteiraTpCapsulaService cafeteiraTpCapsulaService) {
        this.cafeteiraService = cafeteiraService;
        this.cafeteiraTpCapsulaService = cafeteiraTpCapsulaService;
    }

    @PostMapping
    public ResponseEntity<Object> saveCafeteira(@RequestBody @Valid CafeteiraDTO cafeteiraDTO) {
        //TODO verificacoes
        //TODO Testar

        var cafeteiraModel = new CafeteiraModel();
        var cafeteiraTipoCapsulaModel = new CafeteiraTipoCapsulaModel();
        BeanUtils.copyProperties(cafeteiraDTO, cafeteiraModel);
        cafeteiraModel.setDthrcadastro(LocalDateTime.now(ZoneId.of("UTC")));
        var result = cafeteiraService.save(cafeteiraModel);

        //var idcapsula = result.getId();
        for (CafeteiraTipoCapsulaModel c : cafeteiraModel.getCafeteiraTipoCapsulaList()) {
            cafeteiraTipoCapsulaModel.setTipoCapsulaModel(c.getTipoCapsulaModel());//.getId();
            cafeteiraTipoCapsulaModel.setCafeteiraModel(result);
            cafeteiraTpCapsulaService.save(cafeteiraTipoCapsulaModel);
        }

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

}
