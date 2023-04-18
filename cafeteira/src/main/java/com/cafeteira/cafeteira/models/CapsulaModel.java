package com.cafeteira.cafeteira.models;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.boot.autoconfigure.web.WebProperties.Resources.Chain.Strategy;

import com.cafeteira.cafeteira.enums.CafeteiraTipoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "capsula")
public class CapsulaModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private UUID capsula_id;
    @Column(length = 50)
    private String capsula_nome;
    @Column(nullable = false)
    private Integer capsula_intensidade;
    @Column(nullable = false)
    private CafeteiraTipoEnum cafeteira_tipo;
    @Column(nullable = false)
    private String capsula_tamanho;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public UUID getCapsula_id() {
        return capsula_id;
    }
    public void setCapsula_id(UUID capsula_id) {
        this.capsula_id = capsula_id;
    }
    public String getCapsula_nome() {
        return capsula_nome;
    }
    public void setCapsula_nome(String capsula_nome) {
        this.capsula_nome = capsula_nome;
    }
    public Integer getCapsula_intensidade() {
        return capsula_intensidade;
    }
    public void setCapsula_intensidade(Integer capsula_intensidade) {
        this.capsula_intensidade = capsula_intensidade;
    }
    public CafeteiraTipoEnum getCafeteira_tipo() {
        return cafeteira_tipo;
    }
    public void setCafeteira_tipo(CafeteiraTipoEnum cafeteira_tipo) {
        this.cafeteira_tipo = cafeteira_tipo;
    }
    public String getCapsula_tamanho() {
        return capsula_tamanho;
    }
    public void setCapsula_tamanho(String capsula_tamanho) {
        this.capsula_tamanho = capsula_tamanho;
    }
}
