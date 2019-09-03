package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AfiliacionIN {

    @Expose
    @SerializedName("fechaEliminacion")
    private String fechaEliminacion;

    @Expose
    @SerializedName("fechaUltimoMovimiento")
    private String fechaUltimoMovimiento;

    @Expose
    @SerializedName("idEstatus")
    private Long idEstatus;

    @Expose
    @SerializedName("idInstitucion")
    private Long idInstitucion;

    @Expose
    @SerializedName("idTableta")
    private Long idTableta;

    @Expose
    @SerializedName("idVacunado")
    private Long idVacunado;

    @Expose
    @SerializedName("idAfiliacionVacunado")
    private Long idAfiliacionVacunado;

    @Expose
    @SerializedName("numeroAfiliacion")
    private String numeroAfiliacion;

    @Expose
    @SerializedName("numeroExpediente")
    private String numeroExpediente;

    @Expose
    @SerializedName("numeroInstalacion")
    private Long numeroInstalacion;

    public AfiliacionIN() {
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

    public Long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public Long getIdTableta() {
        return idTableta;
    }

    public void setIdTableta(Long idTableta) {
        this.idTableta = idTableta;
    }

    public Long getIdVacunado() {
        return idVacunado;
    }

    public void setIdVacunado(Long idVacunado) {
        this.idVacunado = idVacunado;
    }

    public Long getIdAfiliacionVacunado() {
        return idAfiliacionVacunado;
    }

    public void setIdAfiliacionVacunado(Long idAfiliacionVacunado) {
        this.idAfiliacionVacunado = idAfiliacionVacunado;
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

    public Long getNumeroInstalacion() {
        return numeroInstalacion;
    }

    public void setNumeroInstalacion(Long numeroInstalacion) {
        this.numeroInstalacion = numeroInstalacion;
    }
}
