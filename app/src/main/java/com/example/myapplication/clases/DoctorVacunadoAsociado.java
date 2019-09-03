package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoctorVacunadoAsociado {
    @Expose
    @SerializedName("_id")
    private String _id;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("primer_apellido")
    private String primer_apellido;

    @SerializedName("segundo_apellido")
    private String segundo_apellido;

    @SerializedName("curp")
    private String curp;

    @SerializedName("correo")
    private String correo;

    @SerializedName("clinicas")
    private List<String> clinicas;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primer_apellido;
    }

    public void setPrimerApellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundoApellido() {
        return segundo_apellido;
    }

    public void setSegundoApellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<String> getClinicas() {
        return new ArrayList(Arrays.asList(clinicas.toArray(new String[clinicas.size()])));
    }

    public void setClinicas(ArrayList<String> clinicas) {
        this.clinicas = clinicas;
    }
}
