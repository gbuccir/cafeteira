package com.cafeteira.cafeteira.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cafeteira.cafeteira.models.CapsulaModel;

public interface CapsulaRepository extends JpaRepository<CapsulaModel, UUID> {
    
}
