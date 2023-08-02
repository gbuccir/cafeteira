package com.cafeteira.cafeteira.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cafeteira.cafeteira.models.CapsulaModel;
import com.cafeteira.cafeteira.repositories.CapsulaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Service
public class CapsulaService {
    @PersistenceContext
    final EntityManager entityManager = null;
    
    final CapsulaRepository capsulaRepository;

    public CapsulaService(CapsulaRepository capsulaRepository) {
        this.capsulaRepository = capsulaRepository;
    }

    @Transactional
    public CapsulaModel save(CapsulaModel capsulaModel) {
        return capsulaRepository.save(capsulaModel);
    }

    @Transactional
    public int updateQuantidade(Long id, int quantidade){
        // var id = capsulaModel.getId();
        // var quantidade = capsulaModel.getQuantidade();
        return entityManager.createNativeQuery("UPDATE capsula SET capsula_quantidade=:capsula_quantidade WHERE capsula_id=:capsula_id", CapsulaModel.class)
        .setParameter("capsula_quantidade", quantidade)
        .setParameter("capsula_id", id.intValue())
        .executeUpdate();
        //return capsulaRepository.save(capsulaModel);
        // return capsulaRepository.updateQuantidade(capsulaModel.getQuantidade());
    }

    @Transactional
    public CapsulaModel findById(Long capsulaId){
        var query = entityManager.createNativeQuery("select * from capsula where capsula_id = ?", CapsulaModel.class)
        .setParameter(1, capsulaId);
        var _capsula = query.getSingleResult();
        
        System.out.println(_capsula);
        System.out.println(capsulaId);

        return (CapsulaModel) _capsula;
        // System.out.println(capsulaId);
        // return capsulaRepository.findById(capsulaId).orElseThrow();
    }

    public CapsulaModel findBarcode(String barcode){
        var query = entityManager.createNativeQuery("select * from capsula where capsula_barcode = '?'", CapsulaModel.class)
        .setParameter(1, barcode);
        var _capsula = query.getSingleResult();
        
        System.out.println(_capsula);
        System.out.println(barcode);

        return (CapsulaModel) _capsula;
    }
}
