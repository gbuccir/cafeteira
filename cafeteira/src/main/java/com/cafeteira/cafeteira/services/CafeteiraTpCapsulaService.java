package com.cafeteira.cafeteira.services;

import com.cafeteira.cafeteira.models.CafeteiraTipoCapsulaModel;
import com.cafeteira.cafeteira.repositories.CafeteiraTpCapsulaRepository;

import jakarta.transaction.Transactional;

public class CafeteiraTpCapsulaService {
    final CafeteiraTpCapsulaRepository cafeteiraTpCapsulaRepository;

    public CafeteiraTpCapsulaService(CafeteiraTpCapsulaRepository cafeteiraTpCapsulaRepository) {
        this.cafeteiraTpCapsulaRepository = cafeteiraTpCapsulaRepository;
    }

    @Transactional
    public CafeteiraTipoCapsulaModel save(CafeteiraTipoCapsulaModel cafeteiraTipoCapsulaModel) {
        return cafeteiraTpCapsulaRepository.save(cafeteiraTipoCapsulaModel);
    }
}
