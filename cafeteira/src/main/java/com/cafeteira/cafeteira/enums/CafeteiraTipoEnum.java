package com.cafeteira.cafeteira.enums;

public enum CafeteiraTipoEnum {
    Padrao("Padrao"),
    Virtuo("Virtuo"),
    Outros("Outros");

    private String cafeteiraTipo;

    private CafeteiraTipoEnum(String cafeteiraTipo) {
        this.cafeteiraTipo = cafeteiraTipo;
    }

    public String getCafeteiraTipo() {
        return cafeteiraTipo;
    }

    //construtor?
}
