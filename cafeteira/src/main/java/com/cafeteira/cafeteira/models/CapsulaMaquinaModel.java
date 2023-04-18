package com.cafeteira.cafeteira.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CapsulaMaquina")
public class CapsulaMaquinaModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID capsulaMaquina_id;
    @Column(nullable = false)
    private UUID capsula_id;
    @Column(nullable = false)
    private UUID cafeteira_id;
    @Column(nullable = false)
    private Integer capsulaMaquina_quantidade;
    @Column
    private LocalDateTime capsulaMaquina_drhrcompra;
    @Column
    private LocalDateTime capsulaMaquina_dthruso;
    @Column(nullable = false)
    private char capsulaMaquina_movimentacao;
}
