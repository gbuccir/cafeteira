package com.cafeteira.cafeteira.DTOs;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

import com.cafeteira.cafeteira.models.CafeteiraTipoCapsulaModel;

public class CafeteiraDTO {

    @NotBlank
    @Size(max = 50)
    private String cafeteira_nome;
    @Size(max = 50)
    private String cafeteira_cor;
    @Size(max = 50)
    private String cafeteira_modelo;
    @NotBlank
    private List<CafeteiraTipoCapsulaModel> cafeteiraTipoCapsulaList;

    public String getCafeteira_nome() {
        return cafeteira_nome;
    }

    public void setCafeteira_nome(String cafeteira_nome) {
        this.cafeteira_nome = cafeteira_nome;
    }

    public List<CafeteiraTipoCapsulaModel> getCafeteiraTipoCapsulaList() {
        return cafeteiraTipoCapsulaList;
    }

    public void setCafeteiraTipoCapsulaList(List<CafeteiraTipoCapsulaModel> cafeteiraTipoCapsulaList) {
        this.cafeteiraTipoCapsulaList = cafeteiraTipoCapsulaList;
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

}
