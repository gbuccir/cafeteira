package com.cafeteira.cafeteira.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cafeteira.cafeteira.models.CapsulaModel;

@Repository
public interface CapsulaRepository extends JpaRepository<CapsulaModel, Long> {
    // @Override
    // @Query("SELECT * FROM capsula where capsula_id = :capsulaId")
    // Optional<CapsulaModel> findById(@Param("capsulaId") Long capsulaId);

    // @Query("UPDATE capsula SET capsula_quantidade=:capsula_quantidade WHERE capsula_id=:capsulaId")
    // CapsulaModel updateQuantidade(@Param("capsulaId") int capsulaId);

}
