package com.cafeteira.cafeteira.services;

import com.cafeteira.cafeteira.models.CapsulaModel;
import com.cafeteira.cafeteira.repositories.CapsulaRepository;

import jakarta.transaction.Transactional;

public class CapsulaService {
    final CapsulaRepository capsulaRepository;

    public CapsulaService(CapsulaRepository capsulaRepository) {
        this.capsulaRepository = capsulaRepository;
    }

    @Transactional
    public CapsulaModel save(CapsulaModel capsulaModel) {
        return capsulaRepository.save(capsulaModel);
    }
}
