package com.cafeteira.cafeteira.models;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "edicaocapsula")
public class EdicaoCapsulaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long edicaocapsula_id;
    @Column(nullable = false)
    private String edicaocapsula_nome;
    @Column(nullable = false)
    private LocalDateTime edicaocapsula_dthrcadastro;
    @Column
    private LocalDateTime edicaocapsula_dthrinativacao;
    @OneToMany(mappedBy = "edicaoCapsulaModel")
    private List<CapsulaModel> capsulaModel;

    public Long getId() {
        return edicaocapsula_id;
    }
    public void setId(Long edicaocapsula_id) {
        this.edicaocapsula_id = edicaocapsula_id;
    }
    public String getNome() {
        return edicaocapsula_nome;
    }
    public void setNome(String edicaocapsula_nome) {
        this.edicaocapsula_nome = edicaocapsula_nome;
    }
    public LocalDateTime getDthrcadastro() {
        return edicaocapsula_dthrcadastro;
    }
    public void setDthrcadastro(LocalDateTime edicaocapsula_dthrcadastro) {
        this.edicaocapsula_dthrcadastro = edicaocapsula_dthrcadastro;
    }
    public LocalDateTime getDthrinativacao() {
        return edicaocapsula_dthrinativacao;
    }
    public void setDthrinativacao(LocalDateTime edicaocapsula_dthrinativacao) {
        this.edicaocapsula_dthrinativacao = edicaocapsula_dthrinativacao;
    }
    public List<CapsulaModel> getCapsula() {
        return capsulaModel;
    }
    public void setCapsula(List<CapsulaModel> capsulaModel) {
        this.capsulaModel = capsulaModel;
    }    
}
