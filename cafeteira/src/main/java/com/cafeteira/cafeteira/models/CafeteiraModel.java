package com.cafeteira.cafeteira.models;

import java.io.Serializable;
import java.util.UUID;

import com.cafeteira.cafeteira.enums.CafeteiraTipoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cafeteira")
public class CafeteiraModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID cafeteira_id;
    @Column(nullable = false, length = 50)
    private String cafeteira_nome;
    @Column(length = 50)
    private String cafeteira_cor;
    @Column(length = 50)
    private String cafeteira_modelo;
    @Enumerated(EnumType.STRING)
    @Column
    private CafeteiraTipoEnum cafeteira_tipo;
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public UUID getCafeteira_id() {
        return cafeteira_id;
    }
    public void setCafeteira_id(UUID cafeteira_id) {
        this.cafeteira_id = cafeteira_id;
    }
    public String getCafeteira_nome() {
        return cafeteira_nome;
    }
    public void setCafeteira_nome(String cafeteira_nome) {
        this.cafeteira_nome = cafeteira_nome;
    }
    public String getCafeteira_cor() {
        return cafeteira_cor;
    }
    public void setCafeteira_cor(String cafeteira_cor) {
        this.cafeteira_cor = cafeteira_cor;
    }
    public String getCafeteira_modelo() {
        return cafeteira_modelo;
    }
    public void setCafeteira_modelo(String cafeteira_modelo) {
        this.cafeteira_modelo = cafeteira_modelo;
    }
    public CafeteiraTipoEnum getCafeteira_tipo() {
        return cafeteira_tipo;
    }
    public void setCafeteira_tipo(CafeteiraTipoEnum cafeteira_tipo) {
        this.cafeteira_tipo = cafeteira_tipo;
    }
    
}
