package com.cafeteira.cafeteira.enums;

public enum CapsulaEdicaoEnum {
    InspirazioneItaliana("InspirazioneItaliana"),
    MasterOrigin("MasterOrigin"),
    Espresso("Espresso"),
    WorldExplonation("WorldExplonation"),
    BaristaCreations("BaristaCreations"),
    Limitada("Limitada"),
    Signature("Signature"),
    Alto("Alto"),
    DoubleEspresso("DoubleEspresso"),
    GranLungo("GranLungo"),
    CraftBrew("CraftBrew");



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
