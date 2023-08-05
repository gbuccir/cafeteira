package com.cafeteira.cafeteira.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cafeteira.cafeteira.models.CafeteiraModel;
import com.cafeteira.cafeteira.models.CapsulaModel;
import com.cafeteira.cafeteira.repositories.CafeteiraRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
public class CafeteiraService {
    final CafeteiraRepository cafeteiraRepository;

    @PersistenceContext
    final EntityManager entityManager = null;

    public CafeteiraService(CafeteiraRepository cafeteiraRepository) {
        this.cafeteiraRepository = cafeteiraRepository;
    }

    @Transactional
    public CafeteiraModel save(CafeteiraModel cafeteiraModel) {
        return cafeteiraRepository.save(cafeteiraModel);
    }

    @SuppressWarnings("unchecked")
    public List<CafeteiraModel> getCafeteiraList() {
        var query = entityManager.createNativeQuery("select * from cafeteira", CafeteiraModel.class);
        var _cafeteiraList = query.getResultList();

        return _cafeteiraList;
    }

    @SuppressWarnings("unchecked")
    public List<CapsulaModel> getListCapsulaByCafeteiraTp(int tipoCapsula) {
        var query = entityManager
                .createNativeQuery("select * from tipocapsula\r\n" + //
                        "join capsula on capsula.tipocapsula_id = tipocapsula.tipocapsula_id\r\n" + //
                        "where tipocapsula.tipocapsula_id = :tipoCapsula\r\n" + //
                        "order by capsula.capsula_intensidade desc", CapsulaModel.class)
                .setParameter(1, tipoCapsula);
        var _capsulaList = query.getResultList();

        System.out.println(_capsulaList);
        System.out.println(tipoCapsula);

        return _capsulaList;
    }

}
