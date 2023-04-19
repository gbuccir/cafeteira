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
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public UUID getTipocapsula_id() {
        return tipocapsula_id;
    }
    public void setTipocapsula_id(UUID tipocapsula_id) {
        this.tipocapsula_id = tipocapsula_id;
    }
    public CafeteiraTipoEnum getTipocapsula_tipo() {
        return tipocapsula_tipo;
    }
    public void setTipocapsula_tipo(CafeteiraTipoEnum tipocapsula_tipo) {
        this.tipocapsula_tipo = tipocapsula_tipo;
    }
    public LocalDateTime getTipocapsula_dthrcadastro() {
        return tipocapsula_dthrcadastro;
    }
    public void setTipocapsula_dthrcadastro(LocalDateTime tipocapsula_dthrcadastro) {
        this.tipocapsula_dthrcadastro = tipocapsula_dthrcadastro;
    }
    public LocalDateTime getTipocapsula_dthrinativacao() {
        return tipocapsula_dthrinativacao;
    }
    public void setTipocapsula_dthrinativacao(LocalDateTime tipocapsula_dthrinativacao) {
        this.tipocapsula_dthrinativacao = tipocapsula_dthrinativacao;
    }
    public CapsulaModel getCapsulaModel() {
        return capsulaModel;
    }
    public void setCapsulaModel(CapsulaModel capsulaModel) {
        this.capsulaModel = capsulaModel;
    }        
}
