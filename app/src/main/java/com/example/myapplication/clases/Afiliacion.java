package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Afiliacion  {
    @Expose
    @SerializedName("_id")
    private String _id;

    @Expose
    @SerializedName("id_afiliacion_vacunado")
    private Long idAfiliacionVacunado;

    @Expose
    @SerializedName("id_estatus")
    private Long idEstatus;

    @Expose
    @SerializedName("id_institucion")
    private Long idInstitucion;

    @Expose
    @SerializedName("id_tableta")
    private Integer idTableta;

    @Expose
    @SerializedName("id_vacunado")
    private Long idVacunado;

    @Expose
    @SerializedName("numero_afiliacion")
    private Long numeroAfiliacion;

    @Expose
    @SerializedName("numero_expediente")
    private String numeroExpediente;

    @Expose
    @SerializedName("numero_instalacion")
    private Long numeroInstalacion;

    public Afiliacion() {
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Long getIdAfiliacionVacunado() {
        return idAfiliacionVacunado;
    }

    public void setIdAfiliacionVacunado(Long idAfiliacionVacunado) {
        this.idAfiliacionVacunado = idAfiliacionVacunado;
    }

    public Long getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Long idEstatus) {
        this.idEstatus = idEstatus;
    }

    public Long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public int getIdTableta() {
        return idTableta;
    }

    public void setIdTableta(int idTableta) {
        this.idTableta = idTableta;
    }

    public Long getIdVacunado() {
        return idVacunado;
    }

    public void setIdVacunado(Long idVacunado) {
        this.idVacunado = idVacunado;
    }

    public Long getNumeroAfiliacion() {
        return numeroAfiliacion;
    }

    public void setNumeroAfiliacion(Long numeroAfiliacion) {
        this.numeroAfiliacion = numeroAfiliacion;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public Long getNumeroInstalacion() {
        return numeroInstalacion;
    }

    public void setNumeroInstalacion(Long numeroInstalacion) {
        this.numeroInstalacion = numeroInstalacion;
    }
}
