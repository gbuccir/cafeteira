package com.cafeteira.cafeteira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cafeteira.cafeteira.models.CafeteiraTipoCapsulaModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
@Repository
public interface CafeteiraTpCapsulaRepository extends JpaRepository<CafeteiraTipoCapsulaModel, Long> {
    
    // @Query(name = "SELECT p.rate FROM Product p WHERE p.id=:id")
    // public Optional<String> findRateById(@Param("id") int id);

    // @Transactional
    // public CafeteiraTipoCapsulaModel createCafeteiraTpCapsula(@Param("cafeteira_id") Long cafeteira_id, @Param("tipocapsula_id") Long tipocapsula_id);
    // @Modifying
    // @Query(name = "createCafeteiraTpCapsula2", value = "")
    // public CafeteiraTipoCapsulaModel
    // createCafeteiraTpCapsula(@Param("cafeteira_id") Long
    // cafeteira_id,@Param("tipocapsula_id") Long tipocapsula_id);

}
