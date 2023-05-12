package com.cafeteira.cafeteira.services;

import org.springframework.stereotype.Service;

import com.cafeteira.cafeteira.models.CafeteiraTipoCapsulaModel;
import com.cafeteira.cafeteira.repositories.CafeteiraTpCapsulaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class CafeteiraTpCapsulaService {
    final CafeteiraTpCapsulaRepository cafeteiraTpCapsulaRepository;

    @PersistenceContext
    final EntityManager entityManager = null;

    public CafeteiraTpCapsulaService(CafeteiraTpCapsulaRepository cafeteiraTpCapsulaRepository) {
        this.cafeteiraTpCapsulaRepository = cafeteiraTpCapsulaRepository;
    }

    @Transactional
    public void createCafeteiraTpCapsula(CafeteiraTipoCapsulaModel cafeteiraTipoCapsulaModel) {
         
        entityManager.createNativeQuery("INSERT INTO cafeteiratipocapsula (cafeteira_id, tipocapsula_id)	VALUES (?, ?);")
        .setParameter(1, cafeteiraTipoCapsulaModel.getCafeteira_id())
        .setParameter(2, cafeteiraTipoCapsulaModel.getTipocapsula_id())
        .executeUpdate();

        // var x =  cafeteiraTpCapsulaRepository.createCafeteiraTpCapsula(cafeteiraTipoCapsulaModel.getCafeteira_id(), cafeteiraTipoCapsulaModel.getTipocapsula_id());
        // return x;
        // return cafeteiraTpCapsulaRepository.saveAndFlush(cafeteiraTipoCapsulaModel);
    }

    // @Transactional
    // public CafeteiraTipoCapsulaModel save(CafeteiraTipoCapsulaModel
    // cafeteiraTipoCapsulaModel) {
    // return cafeteiraTpCapsulaRepository.saveAndFlush(cafeteiraTipoCapsulaModel);
    // }
}
