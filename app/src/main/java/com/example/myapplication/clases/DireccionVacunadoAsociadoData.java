package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class DireccionVacunadoAsociadoData  {
    @SerializedName("_id")
    private String _id;

    @SerializedName("clave_estado_inegi")
    private String claveEstadoInegi;

    @SerializedName("clave_municipio_inegi")
    private String claveMunicipioInegi;

    @SerializedName("clave_localidad_inegi")
    private String claveLocalidadInegi;

    @Expose
    @SerializedName("id_estado")
    private Long idEstado;

    @Expose
    @SerializedName("id_municipio")
    private Long idMunicipio;

    @Expose
    @SerializedName("id_localidad")
    private Long idLocalidad;

    @Expose
    @SerializedName("id_tipo_vialidad")
    private Long idTipoVialidad;

    @Expose
    @SerializedName("nombre_vialidad")
    private String nombreVialidad;

    @Expose
    @SerializedName("id_tipo_asentamiento")
    private Long idTipoAsentamiento;

    @Expose
    @SerializedName("nombre_asentamiento")
    private String nombreAsentamiento;

    @Expose
    @SerializedName("cp")
    private String cp;

    @Expose
    @SerializedName("n_exterior")
    private String nExterior;

    @Expose
    @SerializedName("n_interior")
    private String nInterior;

    @SerializedName("__v")
    private Long __v;

    private String entreCalle1;

    private String entreCalle2;

    private String referencia;

    private Long idUsuario;

    @Expose
    private Integer idDireccionCev;

    @Expose
    private Long idDispositivo;

    @Expose
    @SerializedName("id_ageb")
    private Long idAgeb;

    @Expose
    @SerializedName("id_manzana")
    private Long idManzana;

    @Expose
    @SerializedName("estado_validacion")
    private Long estadoValidacion;

    @Expose
    @SerializedName("fecha_autorizacion")
    private Date fechaAutorizacion;

    @Expose
    @SerializedName("numero_instalacion_cev")
    private Long numeroInstalacionCev;

    @Expose
    @SerializedName("id_tableta_cev")
    private Long idTabletaCev;
    @Expose
    @SerializedName("fecha_validacion")
    private String fechaValidacion;

    @Expose
    @SerializedName("fecha_ultimo_movimiento")
    private Date fechaUltimoMovimiento;

    @Expose
    @SerializedName("fecha_eliminacion")
    private Date fechaEliminacion;

    @Expose
    @SerializedName("fecha_registro")
    private Date fechaRegistro;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getClaveEstadoInegi() {
        return claveEstadoInegi;
    }

    public void setClaveEstadoInegi(String claveEstadoInegi) {
        this.claveEstadoInegi = claveEstadoInegi;
    }

    public String getClaveMunicipioInegi() {
        return claveMunicipioInegi;
    }

    public void setClaveMunicipioInegi(String claveMunicipioInegi) {
        this.claveMunicipioInegi = claveMunicipioInegi;
    }

    public String getClaveLocalidadInegi() {
        return claveLocalidadInegi;
    }

    public void setClaveLocalidadInegi(String claveLocalidadInegi) {
        this.claveLocalidadInegi = claveLocalidadInegi;
    }

    public Long getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public Long getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(Long idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public Long getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Long idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public Long getIdTipoVialidad() {
        return idTipoVialidad;
    }

    public void setIdTipoVialidad(Long idTipoVialidad) {
        this.idTipoVialidad = idTipoVialidad;
    }

    public String getNombreVialidad() {
        return nombreVialidad;
    }

    public void setNombreVialidad(String nombreVialidad) {
        this.nombreVialidad = nombreVialidad;
    }

    public Long getIdTipoAsentamiento() {
        return idTipoAsentamiento;
    }

    public void setIdTipoAsentamiento(Long idTipoAsentamiento) {
        this.idTipoAsentamiento = idTipoAsentamiento;
    }

    public String getNombreAsentamiento() {
        return nombreAsentamiento;
    }

    public void setNombreAsentamiento(String nombreAsentamiento) {
        this.nombreAsentamiento = nombreAsentamiento;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getnExterior() {
        return nExterior;
    }

    public void setnExterior(String nExterior) {
        this.nExterior = nExterior;
    }

    public String getnInterior() {
        return nInterior;
    }

    public void setnInterior(String nInterior) {
        this.nInterior = nInterior;
    }

    public Long get__v() {
        return __v;
    }

    public void set__v(Long __v) {
        this.__v = __v;
    }

    public String getEntreCalle1() {
        return entreCalle1;
    }

    public void setEntreCalle1(String entreCalle1) {
        this.entreCalle1 = entreCalle1;
    }

    public String getEntreCalle2() {
        return entreCalle2;
    }

    public void setEntreCalle2(String entreCalle2) {
        this.entreCalle2 = entreCalle2;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdDireccionCev() {
        return idDireccionCev;
    }

    public void setIdDireccionCev(Integer idDireccionCev) {
        this.idDireccionCev = idDireccionCev;
    }

    public Long getIdDispositivo() {
        return idDispositivo;
    }

    public void setIdDispositivo(Long idDispositivo) {
        this.idDispositivo = idDispositivo;
    }

    public Long getIdAgeb() {
        return idAgeb;
    }

    public void setIdAgeb(Long idAgeb) {
        this.idAgeb = idAgeb;
    }

    public Long getIdManzana() {
        return idManzana;
    }

    public void setIdManzana(Long idManzana) {
        this.idManzana = idManzana;
    }

    public Long getEstadoValidacion() {
        return estadoValidacion;
    }

    public void setEstadoValidacion(Long estadoValidacion) {
        this.estadoValidacion = estadoValidacion;
    }

    public Date getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(Date fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public Long getNumeroInstalacionCev() {
        return numeroInstalacionCev;
    }

    public void setNumeroInstalacionCev(Long numeroInstalacionCev) {
        this.numeroInstalacionCev = numeroInstalacionCev;
    }

    public Long getIdTabletaCev() {
        return idTabletaCev;
    }

    public void setIdTabletaCev(Long idTabletaCev) {
        this.idTabletaCev = idTabletaCev;
    }

    public String getFechaValidacion() {
        return fechaValidacion;
    }

    public void setFechaValidacion(String fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }

    public Date getFechaUltimoMovimiento() {
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(Date fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
    }

    public Date getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(Date fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}