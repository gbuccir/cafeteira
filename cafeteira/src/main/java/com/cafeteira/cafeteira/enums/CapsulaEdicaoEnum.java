package com.cafeteira.cafeteira.enums;

public enum CapsulaEdicaoEnum {
    Inspirazione("Inspirazione"),
    Origin("Origin"),
    Espresso("Espresso"),
    WorldExplanation("WorldExplanation"),
    Barista("Barista");

    private String capsulaEdicao;

    public String getCapsulaEdicao() {
        return capsulaEdicao;
    }

    private CapsulaEdicaoEnum(String capsulaEdicao) {
        this.capsulaEdicao = capsulaEdicao;
    }

    public void setCapsulaEdicao(String capsulaEdicao) {
        this.capsulaEdicao = capsulaEdicao;
    }

}
