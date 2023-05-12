package com.cafeteira.cafeteira.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

@Entity
@Table(name = "cafeteiratipocapsula")
// @NamedQuery(name="createCafeteiraTpCapsula", query="insert into cafeteiratipocapsula (cafeteira_id, tipocapsula_id) VALUES (:cafeteira_id, :tipocapsula_id)")
public class CafeteiraTipoCapsulaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long caftpcap_id;

    @ManyToOne(targetEntity = TipoCapsulaModel.class)
    // @MapsId("tipocapsula_id")
    @JoinColumn(name = "tipocapsula_id")
    private Long tipoCapsulaModel;
    // private TipoCapsulaModel tipoCapsulaModel;

    @ManyToOne(targetEntity = CafeteiraModel.class)
    // @MapsId("cafeteira_id")
    @JoinColumn(name = "cafeteira_id")
    private Long cafeteiraModel;
    // private CafeteiraModel cafeteiraModel;

    public Long getCaftpcap_id() {
        return caftpcap_id;
    }

    public void setCaftpcap_id(Long caftpcap_id) {
        this.caftpcap_id = caftpcap_id;
    }

    public Long getTipocapsula_id() {
        return tipoCapsulaModel;
    }

    public void setTipocapsula_id(Long tipocapsula_id) {
        this.tipoCapsulaModel = tipocapsula_id;
    }

    public Long getCafeteira_id() {
        return cafeteiraModel;
    }

    public void setCafeteira_id(Long cafeteira_id) {
        this.cafeteiraModel = cafeteira_id;
    }

    public CafeteiraTipoCapsulaModel(Long tipocapsula_id, Long cafeteira_id) {
        this.tipoCapsulaModel = tipocapsula_id;
        this.cafeteiraModel = cafeteira_id;
    }

    public CafeteiraTipoCapsulaModel() {
    }

    // public CafeteiraTipoCapsulaModel(TipoCapsulaModel tipoCapsulaModel, CafeteiraModel cafeteiraModel) {
    //     this.tipoCapsulaModel = tipoCapsulaModel;
    //     this.cafeteiraModel = cafeteiraModel;
    // }

    // public TipoCapsulaModel getTipoCapsulaModel() {
    //     return tipoCapsulaModel;
    // }

    // public void setTipoCapsulaModel(TipoCapsulaModel tipoCapsulaModel) {
    //     this.tipoCapsulaModel = tipoCapsulaModel;
    // }

    // public CafeteiraModel getCafeteiraModel() {
    //     return cafeteiraModel;
    // }

    // public void setCafeteiraModel(CafeteiraModel cafeteiraModel) {
    //     this.cafeteiraModel = cafeteiraModel;
    // }

}
