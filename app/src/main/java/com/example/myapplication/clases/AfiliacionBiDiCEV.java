package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AfiliacionBiDiCEV  {

    @Expose
    @SerializedName("_id")
    private String _id;

    @Expose
    @SerializedName("id_afiliacion_vacunado")
    private Long idAfiliacionVacunado;

    @Expose
    @SerializedName("id_vacunado")
    private Long idVacunado;

    @Expose
    @SerializedName("numero_instalacion")
    private Long numeroInstalacion;

    @Expose
    @SerializedName("id_tableta")
    private Long idTableta;

    @Expose
    @SerializedName("id_institucion")
    private Long idInstitucion;

    @Expose
    @SerializedName("numero_afiliacion")
    private String numeroAfiliacion;

    @Expose
    @SerializedName("numero_expediente")
    private String numeroExpediente;

    @Expose
    @SerializedName("fecha_eliminacion")
    private String fechaEliminacion;

    @Expose
    @SerializedName("fecha_ultimo_movimiento")
    private String fechaUltimoMovimiento;

    @Expose
    @SerializedName("id_estatus")
    private Long idEstatus;

    public AfiliacionBiDiCEV() {
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

    public Long getIdVacunado() {
        return idVacunado;
    }

    public void setIdVacunado(Long idVacunado) {
        this.idVacunado = idVacunado;
    }

    public Long getNumeroInstalacion() {
        return numeroInstalacion;
    }

    public void setNumeroInstalacion(Long numeroInstalacion) {
        this.numeroInstalacion = numeroInstalacion;
    }

    public Long getIdTableta() {
        return idTableta;
    }

    public void setIdTableta(Long idTableta) {
        this.idTableta = idTableta;
    }

    public Long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public String getNumeroAfiliacion() {
        return numeroAfiliacion;
    }

    public void setNumeroAfiliacion(String numeroAfiliacion) {
        this.numeroAfiliacion = numeroAfiliacion;
    }

    public String getNumeroExpediente() {
        return numeroExpediente;
    }

    public void setNumeroExpediente(String numeroExpediente) {
        this.numeroExpediente = numeroExpediente;
    }

    public String getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(String fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public String getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(String fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

    public Long getIdEstatus() {
        return idEstatus;
    }

    public void setIdEstatus(Long idEstatus) {
        this.idEstatus = idEstatus;
    }
}
