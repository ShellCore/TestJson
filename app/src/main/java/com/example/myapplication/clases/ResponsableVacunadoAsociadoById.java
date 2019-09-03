package com.example.myapplication.clases;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class ResponsableVacunadoAsociadoById  {
    private String idRealm = UUID.randomUUID().toString();

    @SerializedName("_id")
    private ResponsableVacunadoAsociadoData _id;

    @SerializedName("id_parentesco")
    private long id_parentesco;

    @SerializedName("parentesco")
    private String parentesco;

    public String getIdRealm() {
        return idRealm;
    }

    public void setIdRealm(String idRealm) {
        this.idRealm = idRealm;
    }

    public ResponsableVacunadoAsociadoData get_id() {
        return _id;
    }

    public void set_id(ResponsableVacunadoAsociadoData _id) {
        this._id = _id;
    }

    public long getId_parentesco() {
        return id_parentesco;
    }

    public void setId_parentesco(long id_parentesco) {
        this.id_parentesco = id_parentesco;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
