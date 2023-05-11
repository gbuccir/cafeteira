package com.cafeteira.cafeteira.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public class CafeteiraTipoCapsulaDTO {
    @NotBlank
    private @JsonProperty("tipocapsula_id") Long tipocapsula_id;

    
    public CafeteiraTipoCapsulaDTO() {
    }

    public Long getTipocapsula_id() {
        return tipocapsula_id;
    }

    public void setTipocapsula_id(Long tipocapsula_id) {
        this.tipocapsula_id = tipocapsula_id;
    }

    
}
