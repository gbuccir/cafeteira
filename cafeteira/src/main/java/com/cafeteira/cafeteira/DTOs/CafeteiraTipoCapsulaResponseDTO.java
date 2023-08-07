package com.cafeteira.cafeteira.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CafeteiraTipoCapsulaResponseDTO extends CafeteiraDTO{

    public CafeteiraTipoCapsulaResponseDTO(@NotBlank @Size(max = 50) String cafeteira_nome,
            @Size(max = 50) String cafeteira_cor, @Size(max = 50) String cafeteira_modelo,
            @NotBlank int tipocapsula_id) {
        super(cafeteira_nome, cafeteira_cor, cafeteira_modelo, tipocapsula_id);
        //TODO Auto-generated constructor stub
    }

    private @JsonProperty("tipocapsula_id") Long tipocapsula_id;
    
}
