package com.cafeteira.cafeteira.models;

import java.time.LocalDateTime;

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
public class CapsulaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long capsula_id;
    @Column(length = 50)
    private String capsula_nome;
    @Column(nullable = false)
    private Integer capsula_intensidade;
    // @Column
    // private CapsulaEdicaoEnum capsula_edicao;
    @Column(nullable = false)
    private String capsula_tamanho;
    @Column(nullable = false)
    private LocalDateTime capsula_dthrcadastro;
    @Column
    private LocalDateTime capsula_dthrinativacao;
    @Column
    private int capsula_quantidade;
    @ManyToOne
    @JoinColumn(name = "tipocapsula_id")
    private TipoCapsulaModel tipoCapsulaModel;
   
    @ManyToOne
    @JoinColumn(name = "edicaocapsula_id")
    private EdicaoCapsulaModel edicaoCapsulaModel;

    @Column
    private String capsula_barcode;
    @Column(nullable = true)
    private int capsula_limite;


    public Long getId() {
        return capsula_id;
    }

    public void setId(Long capsula_id) {
        this.capsula_id = capsula_id;
    }

    public LocalDateTime getDthrcadastro() {
        return capsula_dthrcadastro;
    }

    public void setDthrcadastro(LocalDateTime capsula_dthrcadastro) {
        this.capsula_dthrcadastro = capsula_dthrcadastro;
    }

    public LocalDateTime getDthrinativacao() {
        return capsula_dthrinativacao;
    }

    public void setDthrinativacao(LocalDateTime capsula_dthrinativacao) {
        this.capsula_dthrinativacao = capsula_dthrinativacao;
    }

    public TipoCapsulaModel getTipoCapsula() {
        return tipoCapsulaModel;
    }

    public void setTipoCapsula(TipoCapsulaModel tipoCapsulaModel) {
        this.tipoCapsulaModel = tipoCapsulaModel;
    }

    public String getNome() {
        return capsula_nome;
    }

    public void setNome(String capsula_nome) {
        this.capsula_nome = capsula_nome;
    }

    public Integer getIntensidade() {
        return capsula_intensidade;
    }

    public void setIntensidade(Integer capsula_intensidade) {
        this.capsula_intensidade = capsula_intensidade;
    }

    // public CapsulaEdicaoEnum getEdicao() {
    //     return capsula_edicao;
    // }

    // public void setEdicao(CapsulaEdicaoEnum capsula_edicao) {
    //     this.capsula_edicao = capsula_edicao;
    // }

    public String getTamanho() {
        return capsula_tamanho;
    }

    public void setTamanho(String capsula_tamanho) {
        this.capsula_tamanho = capsula_tamanho;
    }

    public int getQuantidade() {
        return capsula_quantidade;
    }

    public void setQuantidade(int capsula_quantidade) {
        this.capsula_quantidade = capsula_quantidade;
    }

    public void setBarcode(String barcode){
        this.capsula_barcode = barcode;
    }

    public String getBarcode(){
        return this.capsula_barcode;
    }

    public void setLimite(int limite){
        this.capsula_limite = limite;
    }

    public int getLimite(){
        return this.capsula_limite;
    }
}
