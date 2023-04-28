package com.cafeteira.cafeteira.models;

import java.time.LocalDateTime;
import java.util.List;

import com.cafeteira.cafeteira.enums.CafeteiraTipoEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tipocapsula")
public class TipoCapsulaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long tipocapsula_id;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CafeteiraTipoEnum tipocapsula_tipo;
    @Column(nullable = false)
    private LocalDateTime tipocapsula_dthrcadastro;
    @Column
    private LocalDateTime tipocapsula_dthrinativacao;
    @OneToMany(mappedBy = "tipoCapsulaModel")
    private List<CapsulaModel> capsulaModel;
    // @ManyToMany(cascade = CascadeType.ALL)
    // @JoinTable(name = "cafeteiratpcapsula", joinColumns = @JoinColumn(name = "tipocapsula_id", referencedColumnName = "tipocapsula_id"), inverseJoinColumns = @JoinColumn(name = "cafeteira_id", referencedColumnName = "cafeteira_id"))
    // private List<CafeteiraModel> cafeteiraList;
    @OneToMany(mappedBy = "tipoCapsulaModel")
    private List<CafeteiraTipoCapsulaModel> cafeteiraTipoCapsulaList;

    public Long getId() {
        return tipocapsula_id;
    }

    public void setId(Long tipocapsula_id) {
        this.tipocapsula_id = tipocapsula_id;
    }

    public CafeteiraTipoEnum getTipo() {
        return tipocapsula_tipo;
    }

    public void setTipo(CafeteiraTipoEnum tipocapsula_tipo) {
        this.tipocapsula_tipo = tipocapsula_tipo;
    }

    public LocalDateTime getDthrcadastro() {
        return tipocapsula_dthrcadastro;
    }

    public void setDthrcadastro(LocalDateTime tipocapsula_dthrcadastro) {
        this.tipocapsula_dthrcadastro = tipocapsula_dthrcadastro;
    }

    public LocalDateTime getDthrinativacao() {
        return tipocapsula_dthrinativacao;
    }

    public void setDthrinativacao(LocalDateTime tipocapsula_dthrinativacao) {
        this.tipocapsula_dthrinativacao = tipocapsula_dthrinativacao;
    }

    public List<CapsulaModel> getModel() {
        return capsulaModel;
    }

    public void setModel(List<CapsulaModel> capsulaModel) {
        this.capsulaModel = capsulaModel;
    }

    public List<CafeteiraTipoCapsulaModel> getCafeteiraTipoCapsulaList() {
        return cafeteiraTipoCapsulaList;
    }

    public void setCafeteiraTipoCapsulaList(List<CafeteiraTipoCapsulaModel> cafeteiraTipoCapsulaList) {
        this.cafeteiraTipoCapsulaList = cafeteiraTipoCapsulaList;
    }

}
