package com.cafeteira.cafeteira.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public class CapsulaDTO {
    
    private @JsonProperty("capsula_quantidade") int capsula_quantidade;

    public CapsulaDTO() {
    }

    public CapsulaDTO(int capsula_quantidade) {
        this.capsula_quantidade = capsula_quantidade;
    }

    public int getCapsulaQuantidade() {
        return capsula_quantidade;
    }

    public void setCapsulaQuantidade(int capsula_quantidade) {
        this.capsula_quantidade = capsula_quantidade;
    }

}
