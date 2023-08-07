package com.cafeteira.cafeteira.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cafeteira.cafeteira.dtos.CafeteiraDTO;
import com.cafeteira.cafeteira.dtos.CafeteiraTipoCapsulaResponseDTO;
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
    public List<CafeteiraDTO> getCafeteiraList() {
        var query = entityManager.createNativeQuery("select c.cafeteira_nome, c.cafeteira_cor, c.cafeteira_modelo, caftp.tipocapsula_id  from cafeteira c \r\n" + //
                "join cafeteiratipocapsula as caftp ON caftp.cafeteira_id = c.cafeteira_id");
        //var _cafeteiraList = query.getResultList();
        
        List<CafeteiraDTO> _cafeteiraList = (List<CafeteiraDTO>) query.getResultList();

        // System.out.println(query.toString());
        // System.out.println(_cafeteiraList1);

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
