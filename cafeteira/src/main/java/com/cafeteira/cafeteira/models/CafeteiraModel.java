package com.cafeteira.cafeteira.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cafeteira")
public class CafeteiraModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long cafeteira_id;
    @Column(nullable = false, length = 50)
    private String cafeteira_nome;
    @Column(length = 50)
    private String cafeteira_cor;
    @Column(length = 50)
    private String cafeteira_modelo;
    @Column(nullable = false)
    private LocalDateTime cafeteira_dthrcadastro;
    @Column
    private LocalDateTime cafeteira_dthrinativacao;
    // @ManyToMany(mappedBy = "cafeteiraList", cascade = CascadeType.ALL)
    // private List<TipoCapsulaModel> tipoCapsulaList;
    @OneToMany(mappedBy = "cafeteiraModel")
    private List<CafeteiraTipoCapsulaModel> cafeteiraTipoCapsulaList;

    public Long getId() {
        return cafeteira_id;
    }

    public void setId(Long cafeteira_id) {
        this.cafeteira_id = cafeteira_id;
    }

    public String getNome() {
        return cafeteira_nome;
    }

    public void setNome(String cafeteira_nome) {
        this.cafeteira_nome = cafeteira_nome;
    }

    public String getCor() {
        return cafeteira_cor;
    }

    public void setCor(String cafeteira_cor) {
        this.cafeteira_cor = cafeteira_cor;
    }

    public String getModelo() {
        return cafeteira_modelo;
    }

    public void setModelo(String cafeteira_modelo) {
        this.cafeteira_modelo = cafeteira_modelo;
    }

    public LocalDateTime getDthrcadastro() {
        return cafeteira_dthrcadastro;
    }

    public void setDthrcadastro(LocalDateTime cafeteira_dthrcadastro) {
        this.cafeteira_dthrcadastro = cafeteira_dthrcadastro;
    }

    public LocalDateTime getDthrinativacao() {
        return cafeteira_dthrinativacao;
    }

    public void setDthrinativacao(LocalDateTime cafeteira_dthrinativacao) {
        this.cafeteira_dthrinativacao = cafeteira_dthrinativacao;
    }

    public List<CafeteiraTipoCapsulaModel> getCafeteiraTipoCapsulaList() {
        return cafeteiraTipoCapsulaList;
    }

    public void setCafeteiraTipoCapsulaList(List<CafeteiraTipoCapsulaModel> cafeteiraTipoCapsulaList) {
        this.cafeteiraTipoCapsulaList = cafeteiraTipoCapsulaList;
    }

   
}
