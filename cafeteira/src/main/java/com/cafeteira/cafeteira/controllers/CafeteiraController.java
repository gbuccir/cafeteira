package com.cafeteira.cafeteira.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cafeteira.cafeteira.dtos.CafeteiraDTO;
import com.cafeteira.cafeteira.models.CafeteiraModel;
import com.cafeteira.cafeteira.models.CafeteiraTipoCapsulaModel;
import com.cafeteira.cafeteira.services.CafeteiraService;
import com.cafeteira.cafeteira.services.CafeteiraTpCapsulaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
//@RequestMapping("/cafeteira")
public class CafeteiraController {
    final CafeteiraService cafeteiraService;
    final CafeteiraTpCapsulaService cafeteiraTpCapsulaService;

    public CafeteiraController(CafeteiraService cafeteiraService, CafeteiraTpCapsulaService cafeteiraTpCapsulaService) {
        this.cafeteiraService = cafeteiraService;
        this.cafeteiraTpCapsulaService = cafeteiraTpCapsulaService;
    }

    @RequestMapping("/cafeteira/listCafeteira")
    @GetMapping
    public ResponseEntity<Object> listCafeteira() {
        try {
            var result = cafeteiraService.getCafeteiraList();

            return ResponseEntity.status(HttpStatus.OK).body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }

    @RequestMapping("/cafeteira/saveCafeteira")
    @PostMapping
    public ResponseEntity<Object> saveCafeteira(@RequestBody /* @Valid */ CafeteiraDTO cafeteiraDTO) {
        // TODO verificacoes
        // TODO Testar
        try {
            var cafeteiraModel = new CafeteiraModel();
            BeanUtils.copyProperties(cafeteiraDTO, cafeteiraModel);

            cafeteiraModel.setDthrcadastro(LocalDateTime.now(ZoneId.of("UTC")));
            // OK
            var result = cafeteiraService.save(cafeteiraModel);

            // var _result = this.saveCafeteiraTipoCapsula(cafeteiraDTO, cafeteiraModel);
            for (var source : cafeteiraDTO.getCafeteiraTipoCapsulaList()) {
                var cafeteiraTipoCapsulaModel = new CafeteiraTipoCapsulaModel(source.getTipocapsula_id(),
                        cafeteiraModel.getCafeteira_id());
                // NOK
                cafeteiraTpCapsulaService.createCafeteiraTpCapsula(cafeteiraTipoCapsulaModel);
            }

            return ResponseEntity.status(HttpStatus.CREATED).body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }

    @RequestMapping("/cafeteira/listCapsulaByCafeteiraTp/{capsulaId}")
    @GetMapping
    public ResponseEntity<Object> listCapsulaByCafeteiraTp(@RequestBody /* @Valid */ int tipoCapsula) {
        try {
            var result = cafeteiraService.getListCapsulaByCafeteiraTp(tipoCapsula);

            return ResponseEntity.status(HttpStatus.OK).body(result);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
        }
    }


    // private ResponseEntity<Object> saveCafeteiraTipoCapsula(CafeteiraDTO
    // cafeteiraDTO, CafeteiraModel cafeteiraModel) {
    // try {
    // for (var source : cafeteiraDTO.getCafeteiraTipoCapsulaList()) {
    // var cafeteiraTipoCapsulaModel = new
    // CafeteiraTipoCapsulaModel(source.getTipocapsula_id(),
    // cafeteiraModel.getCafeteira_id());
    // // NOK
    // var result = cafeteiraTpCapsulaService.save(cafeteiraTipoCapsulaModel);
    // }

    // return ResponseEntity.status(HttpStatus.CREATED).body(true);
    // } catch (Exception e) {
    // return
    // ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.toString());
    // }
    // }

}
