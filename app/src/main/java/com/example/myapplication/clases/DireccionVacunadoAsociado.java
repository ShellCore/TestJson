package com.example.myapplication.clases;

import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class DireccionVacunadoAsociado {
    private String _id = UUID.randomUUID().toString();

    @SerializedName("id_direccion")
    private DireccionVacunadoAsociadoData idDireccion;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public DireccionVacunadoAsociadoData getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(DireccionVacunadoAsociadoData idDireccion) {
        this.idDireccion = idDireccion;
    }
}
