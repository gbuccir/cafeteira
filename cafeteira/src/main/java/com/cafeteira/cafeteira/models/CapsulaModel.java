package com.cafeteira.cafeteira.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.cafeteira.cafeteira.enums.CapsulaEdicaoEnum;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;  
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "capsula")
public class CapsulaModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long capsula_id;
    @Column(length = 50)
    private String capsula_nome;
    @Column(nullable = false)
    private Integer capsula_intensidade;
    @Column
    private CapsulaEdicaoEnum capsula_edicao;
    @Column(nullable = false)
    private String capsula_tamanho;
    @Column(nullable = false)
    private LocalDateTime capsula_dthrcadastro;
    @Column
    private LocalDateTime capsula_dthrinativacao;
    @ManyToOne
    @JoinColumn(name = "tipocapsula_id")
    private TipoCapsulaModel tipoCapsulaModel;

    public Long getCapsula_id() {
        return capsula_id;
    }

    public void setCapsula_id(Long capsula_id) {
        this.capsula_id = capsula_id;
    }

    public LocalDateTime getCapsulaDthrcadastro() {
        return capsula_dthrcadastro;
    }

    public void setCapsula_dthrcadastro(LocalDateTime capsula_dthrcadastro) {
        this.capsula_dthrcadastro = capsula_dthrcadastro;
    }

    public LocalDateTime getCapsulaDthrinativacao() {
        return capsula_dthrinativacao;
    }

    public void setCapsulaDthrinativacao(LocalDateTime capsula_dthrinativacao) {
        this.capsula_dthrinativacao = capsula_dthrinativacao;
    }

    public TipoCapsulaModel getTipoCapsulaModel() {
        return tipoCapsulaModel;
    }

    public void setTipoCapsulaModel(TipoCapsulaModel tipoCapsulaModel) {
        this.tipoCapsulaModel = tipoCapsulaModel;
    }

    public Long getCapsulaId() {
        return capsula_id;
    }

    public void setCapsulaId(Long capsula_id) {
        this.capsula_id = capsula_id;
    }

    public String getCapsulaNome() {
        return capsula_nome;
    }

    public void setCapsulaNome(String capsula_nome) {
        this.capsula_nome = capsula_nome;
    }

    public Integer getCapsulaIntensidade() {
        return capsula_intensidade;
    }

    public void setCapsulaIntensidade(Integer capsula_intensidade) {
        this.capsula_intensidade = capsula_intensidade;
    }

    public CapsulaEdicaoEnum getCafeteiraEdicao() {
        return capsula_edicao;
    }

    public void setCafeteiraEdicao(CapsulaEdicaoEnum capsula_edicao) {
        this.capsula_edicao = capsula_edicao;
    }

    public String getCapsulaTamanho() {
        return capsula_tamanho;
    }

    public void setCapsulaTamanho(String capsula_tamanho) {
        this.capsula_tamanho = capsula_tamanho;
    }
}
