package com.cafeteira.cafeteira.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import com.cafeteira.cafeteira.enums.CafeteiraTipoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class TipoCapsulaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID tipocapsula_id;
    @Column(nullable = false)
    private CafeteiraTipoEnum tipocapsula_tipo;
    @Column(nullable = false)
    private LocalDateTime tipocapsula_dthrcadastro;
    @Column
    private LocalDateTime tipocapsula_dthrinativacao;
    @OneToOne(mappedBy = "CapsulaModel")
    private CapsulaModel capsulaModel;
        
}
