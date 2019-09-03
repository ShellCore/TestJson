package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class ResponsableVacunadoAsociado {
    private String idRealm = UUID.randomUUID().toString();

    @Expose
    @SerializedName("_id")
    private ResponsableVacunadoAsociadoData _id;

    @Expose
    @SerializedName("id_parentesco")
    private Long id_parentesco;

    @Expose
    @SerializedName("parentesco")
    private String parentesco;

    public String getIdRealm() {
        return idRealm;
    }

    public void setIdRealm(String idRealm) {
        this.idRealm = idRealm;
    }

    public ResponsableVacunadoAsociadoData getId() {
        return _id;
    }

    public void setId(ResponsableVacunadoAsociadoData _id) {
        this._id = _id;
    }

    public long getIdParentesco() {
        return id_parentesco;
    }

    public void setIdParentesco(long id_parentesco) {
        this.id_parentesco = id_parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
