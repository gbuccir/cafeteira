package com.cafeteira.cafeteira.enums;

public enum CafeteiraTipoEnum {
    Padrao(1),
    Viruo(2),
    Outros(3);

    private int cafeteiraTipo;

    private CafeteiraTipoEnum(int cafeteiraTipo) {
        this.cafeteiraTipo = cafeteiraTipo;
    }

    public int getCafeteiraTipo() {
        return cafeteiraTipo;
    }

    //construtor?
}
