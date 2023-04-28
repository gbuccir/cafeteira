package com.cafeteira.cafeteira.models;

import org.apache.tomcat.util.security.PrivilegedSetAccessControlContext;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name = "cafeteiratipocapsula")
public class CafeteiraTipoCapsulaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "serial")
    private Long caftpcap_id;

    @ManyToOne
    @MapsId("tipocapsula_id")
    @JoinColumn(name = "tipocapsula_id")
    private TipoCapsulaModel tipoCapsulaModel;
    // private Long tipocapsula_id;

    @ManyToOne
    @MapsId("cafeteira_id")
    @JoinColumn(name = "cafeteira_id")
    private CafeteiraModel cafeteiraModel;
    // private Long cafeteira_id;

    @Column
    private Long caftpcap_quantidade;

    public TipoCapsulaModel getTipoCapsulaModel() {
        return tipoCapsulaModel;
    }

    public void setTipoCapsulaModel(TipoCapsulaModel tipoCapsulaModel) {
        this.tipoCapsulaModel = tipoCapsulaModel;
    }

    public CafeteiraModel getCafeteiraModel() {
        return cafeteiraModel;
    }

    public void setCafeteiraModel(CafeteiraModel cafeteiraModel) {
        this.cafeteiraModel = cafeteiraModel;
    }

    public Long getCaftpcap_id() {
        return caftpcap_id;
    }

    public void setCaftpcap_id(Long caftpcap_id) {
        this.caftpcap_id = caftpcap_id;
    }

    

    public Long getCaftpcap_quantidade() {
        return caftpcap_quantidade;
    }

    public void setCaftpcap_quantidade(Long caftpcap_quantidade) {
        this.caftpcap_quantidade = caftpcap_quantidade;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((caftpcap_id == null) ? 0 : caftpcap_id.hashCode());
        result = prime * result + ((tipoCapsulaModel == null) ? 0 : tipoCapsulaModel.hashCode());
        result = prime * result + ((cafeteiraModel == null) ? 0 : cafeteiraModel.hashCode());
        result = prime * result + ((caftpcap_quantidade == null) ? 0 : caftpcap_quantidade.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CafeteiraTipoCapsulaModel other = (CafeteiraTipoCapsulaModel) obj;
        if (caftpcap_id == null) {
            if (other.caftpcap_id != null)
                return false;
        } else if (!caftpcap_id.equals(other.caftpcap_id))
            return false;
        if (tipoCapsulaModel == null) {
            if (other.tipoCapsulaModel != null)
                return false;
        } else if (!tipoCapsulaModel.equals(other.tipoCapsulaModel))
            return false;
        if (cafeteiraModel == null) {
            if (other.cafeteiraModel != null)
                return false;
        } else if (!cafeteiraModel.equals(other.cafeteiraModel))
            return false;
        if (caftpcap_quantidade == null) {
            if (other.caftpcap_quantidade != null)
                return false;
        } else if (!caftpcap_quantidade.equals(other.caftpcap_quantidade))
            return false;
        return true;
    }


}
