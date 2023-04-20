package com.cafeteira.cafeteira.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafeteira.cafeteira.models.CafeteiraModel;

public interface CafeteiraRepository extends JpaRepository<CafeteiraModel, Long>{
    
}
