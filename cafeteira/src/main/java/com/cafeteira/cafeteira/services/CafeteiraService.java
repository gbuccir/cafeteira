package com.cafeteira.cafeteira.services;

import com.cafeteira.cafeteira.models.CafeteiraModel;
import com.cafeteira.cafeteira.repositories.CafeteiraRepository;

import jakarta.transaction.Transactional;

public class CafeteiraService {

    final CafeteiraRepository cafeteiraRepository;

    public CafeteiraService(CafeteiraRepository cafeteiraRepository) {
        this.cafeteiraRepository = cafeteiraRepository;
    }

    @Transactional
    public CafeteiraModel save(CafeteiraModel cafeteiraModel) {
        return cafeteiraRepository.save(cafeteiraModel);
    }

}
