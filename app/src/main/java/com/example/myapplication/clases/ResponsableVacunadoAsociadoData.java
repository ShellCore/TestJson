package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class ResponsableVacunadoAsociadoData {
    @SerializedName("_id")
    private String id;

    @SerializedName("nombre")
    private String nombre;

    @SerializedName("primer_apellido")
    private String primerApellido;

    @SerializedName("segundo_apellido")
    private String segundoApellido;

    @SerializedName("id_nacionalidad")
    private long idNacionalidad;

    @SerializedName("id_estado_nacimiento")
    private long idEstadoNacimiento;

    @SerializedName("sexo")
    private String sexo;

    @SerializedName("curp")
    private String curp;

    @SerializedName("correo")
    private String correo;

    @SerializedName("fecha_nacimiento")
    private String fechaNacimiento;

    @SerializedName("fecha_registro")
    private Date fechaRegistro;

    @Expose
    @SerializedName("id_responsable_cev")
    private Long idResponsableCev;

    @Expose
    @SerializedName("rfc")
    private String rfc;

    @Expose
    @SerializedName("numero_local")
    private String numeroLocal;

    @Expose
    @SerializedName("id_operador")
    private Integer idOperador;

    @SerializedName("estado_validacion")
    private long estadoValidacion;

    @SerializedName("numero_celular")
    private long numeroCelular;

    @SerializedName("id_origen_registro")
    private long idOrigenRegistro;

    @SerializedName("fecha_autorizacion")
    private String fechaAutorizacion;

    @SerializedName("rfc_cev")
    private String rfcCev;

    @SerializedName("fecha_registro_app")
    private Date fechaRegistroApp;

    @SerializedName("fecha_ultimo_movimiento")
    private String fechaUltimoMovimiento;

    @SerializedName("img")
    private String img;

    public ResponsableVacunadoAsociadoData() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public long getIdNacionalidad() {
        return idNacionalidad;
    }

    public void setIdNacionalidad(long idNacionalidad) {
        this.idNacionalidad = idNacionalidad;
    }

    public long getIdEstadoNacimiento() {
        return idEstadoNacimiento;
    }

    public void setIdEstadoNacimiento(long idEstadoNacimiento) {
        this.idEstadoNacimiento = idEstadoNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Long getIdResponsableCev() {
        return idResponsableCev;
    }

    public void setIdResponsableCev(Long idResponsableCev) {
        this.idResponsableCev = idResponsableCev;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNumeroLocal() {
        return numeroLocal;
    }

    public void setNumeroLocal(String numeroLocal) {
        this.numeroLocal = numeroLocal;
    }

    public Integer getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(Integer idOperador) {
        this.idOperador = idOperador;
    }

    public long getEstadoValidacion() {
        return estadoValidacion;
    }

    public void setEstadoValidacion(long estadoValidacion) {
        this.estadoValidacion = estadoValidacion;
    }

    public long getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(long numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public long getIdOrigenRegistro() {
        return idOrigenRegistro;
    }

    public void setIdOrigenRegistro(long idOrigenRegistro) {
        this.idOrigenRegistro = idOrigenRegistro;
    }

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public String getRfcCev() {
        return rfcCev;
    }

    public void setRfcCev(String rfcCev) {
        this.rfcCev = rfcCev;
    }

    public Date getFechaRegistroApp() {
        return fechaRegistroApp;
    }

    public void setFechaRegistroApp(Date fechaRegistroApp) {
        this.fechaRegistroApp = fechaRegistroApp;
    }

    public String getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(String fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
