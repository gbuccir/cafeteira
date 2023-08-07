package com.cafeteira.cafeteira.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CafeteiraDTO {

    @NotBlank
    @Size(max = 50)
    private @JsonProperty("cafeteira_nome") String cafeteira_nome;
    @Size(max = 50)
    private @JsonProperty("cafeteira_cor") String cafeteira_cor;
    @Size(max = 50)
    private @JsonProperty("cafeteira_modelo") String cafeteira_modelo;
    @NotBlank
    private @JsonProperty("tipocapsula_id") int tipocapsula_id;
    //private List<CafeteiraTipoCapsulaDTO> cafeteiraTipoCapsulaList;

    public String getCafeteira_nome() {
        return cafeteira_nome;
    }

    public CafeteiraDTO(@NotBlank @Size(max = 50) String cafeteira_nome, @Size(max = 50) String cafeteira_cor,
            @Size(max = 50) String cafeteira_modelo, @NotBlank int tipocapsula_id) {
        this.cafeteira_nome = cafeteira_nome;
        this.cafeteira_cor = cafeteira_cor;
        this.cafeteira_modelo = cafeteira_modelo;
        this.tipocapsula_id = tipocapsula_id;
    }

    public void setCafeteira_nome(String cafeteira_nome) {
        this.cafeteira_nome = cafeteira_nome;
    }

    // public List<CafeteiraTipoCapsulaDTO> getCafeteiraTipoCapsulaList() {
    //     return cafeteiraTipoCapsulaList;
    // }

    // public void setCafeteiraTipoCapsulaList(List<CafeteiraTipoCapsulaDTO> cafeteiraTipoCapsulaList) {
    //     this.cafeteiraTipoCapsulaList = cafeteiraTipoCapsulaList;
    // }

    public int getTipocapsula_id() {
        return tipocapsula_id;
    }

    public void setTipocapsula_id(int tipocapsula_id) {
        this.tipocapsula_id = tipocapsula_id;
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
