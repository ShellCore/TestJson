package com.example.myapplication.clases;

import com.google.gson.annotations.SerializedName;


public class Vacuna {
    @SerializedName("_id")
    private String _id;

    @SerializedName("id_vacuna")
    private Long idVacuna;

    @SerializedName("id_origen_registro")
    private Long idOrigenRegistro;

    @SerializedName("dosis_ml")
    private String dosisMl;

    @SerializedName("id_color_aplicacion")
    private Long idColorAplicacion;

    @SerializedName("id_dispositivo_vac")
    private String idDispositivoVac;

    @SerializedName("lote")
    private String lote;

    @SerializedName("fecha_expiracion")
    private String fechaExpiracion;

    @SerializedName("nombre_vacuna")
    private String nombreVacuna;

    @SerializedName("fecha_aplicacion")
    private String fechaAplicacion;

    @SerializedName("fecha_registro_bd")
    private String fechaRegistroBd;

    @SerializedName("id_usuario_vac")
    private String idUsuarioVac;

    @SerializedName("fecha_autorizacion")
    private String fechaAutorizacion;

    @SerializedName("estado_validacion")
    private Long estadoValidacion;

    @SerializedName("id_doctor")
    private String idDoctor;

    @SerializedName("__v")
    private Long __v;

    @SerializedName("vacuna_historica")
    private Boolean vacunaHistorica;

    @SerializedName("id_etapa")
    private Long idEtapa;

    @SerializedName("dosis")
    private Long idDosis;

    @SerializedName("observaciones")
    private String observaciones;

    @SerializedName("id_vacunado")
    private String idVacunado;

    @SerializedName("fecha_consignacion_app")
    private String fechaConsignacionApp;

    @SerializedName("numero_instalacion")
    private Long numeroInstalacion;

    @SerializedName("id_tableta")
    private Long idTableta;


    @SerializedName("nombre_equivalencia")
    private String nombreEquivalencia;

    @SerializedName("id_equivalencia")
    private Long idEquivalencia;

    @SerializedName("id_clues")
    private Long idClues;

    @SerializedName("id_institucion")
    private Long idInstitucion;

    @SerializedName("id_vacunado_vacuna")
    private Long idVacunadoVacuna;

    @SerializedName("origen_aplicacion")
    private String origenAplicacion;

    @SerializedName("lugar_aplicacion")
    private Long lugarAplicacion;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public long getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(long idVacuna) {
        this.idVacuna = idVacuna;
    }

    public long getIdOrigenRegistro() {
        return idOrigenRegistro;
    }

    public void setIdOrigenRegistro(long idOrigenRegistro) {
        this.idOrigenRegistro = idOrigenRegistro;
    }

    public String getDosisMl() {
        return dosisMl;
    }

    public void setDosisMl(String dosisMl) {
        this.dosisMl = dosisMl;
    }

    public Long getIdColorAplicacion() {
        return idColorAplicacion;
    }

    public void setIdColorAplicacion(Long idColorAplicacion) {
        this.idColorAplicacion = idColorAplicacion;
    }

    public String getIdDispositivoVac() {
        return idDispositivoVac;
    }

    public void setIdDispositivoVac(String idDispositivoVac) {
        this.idDispositivoVac = idDispositivoVac;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public String getNombreVacuna() {
        return nombreVacuna;
    }

    public void setNombreVacuna(String nombreVacuna) {
        this.nombreVacuna = nombreVacuna;
    }

    public String getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(String fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public String getFechaRegistroBd() {
        return fechaRegistroBd;
    }

    public void setFechaRegistroBd(String fechaRegistroBd) {
        this.fechaRegistroBd = fechaRegistroBd;
    }

    public String getIdUsuarioVac() {
        return idUsuarioVac;
    }

    public void setIdUsuarioVac(String idUsuarioVac) {
        this.idUsuarioVac = idUsuarioVac;
    }

    public String getFechaAutorizacion() {
        return fechaAutorizacion;
    }

    public void setFechaAutorizacion(String fechaAutorizacion) {
        this.fechaAutorizacion = fechaAutorizacion;
    }

    public long getEstadoValidacion() {
        return estadoValidacion;
    }

    public void setEstadoValidacion(long estadoValidacion) {
        this.estadoValidacion = estadoValidacion;
    }

    public String getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(String idDoctor) {
        this.idDoctor = idDoctor;
    }

    public long get__v() {
        return __v;
    }

    public void set__v(long __v) {
        this.__v = __v;
    }

    public boolean isVacunaHistorica() {
        return vacunaHistorica;
    }

    public void setVacunaHistorica(boolean vacunaHistorica) {
        this.vacunaHistorica = vacunaHistorica;
    }

    public long getIdEtapa() {
        return idEtapa;
    }

    public void setIdEtapa(long idEtapa) {
        this.idEtapa = idEtapa;
    }

    public long getIdDosis() {
        return idDosis;
    }

    public void setIdDosis(long idDosis) {
        this.idDosis = idDosis;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getIdVacunado() {
        return idVacunado;
    }

    public void setIdVacunado(String idVacunado) {
        this.idVacunado = idVacunado;
    }

    public String getFechaConsignacionApp() {
        return fechaConsignacionApp;
    }

    public void setFechaConsignacionApp(String fechaConsignacionApp) {
        this.fechaConsignacionApp = fechaConsignacionApp;
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

    public String getNombreEquivalencia() {
        return nombreEquivalencia;
    }

    public void setNombreEquivalencia(String nombreEquivalencia) {
        this.nombreEquivalencia = nombreEquivalencia;
    }

    public Long getIdEquivalencia() {
        return idEquivalencia;
    }

    public void setIdEquivalencia(Long idEquivalencia) {
        this.idEquivalencia = idEquivalencia;
    }

    public Long getIdClues() {
        return idClues;
    }

    public void setIdClues(Long idClues) {
        this.idClues = idClues;
    }

    public Long getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(Long idInstitucion) {
        this.idInstitucion = idInstitucion;
    }

    public Long getIdVacunadoVacuna() {
        return idVacunadoVacuna;
    }

    public void setIdVacunadoVacuna(Long idVacunadoVacuna) {
        this.idVacunadoVacuna = idVacunadoVacuna;
    }

    public String getOrigenAplicacion() {
        return origenAplicacion;
    }

    public void setOrigenAplicacion(String origenAplicacion) {
        this.origenAplicacion = origenAplicacion;
    }

    public Long getLugarAplicacion() {
        return lugarAplicacion;
    }

    public void setLugarAplicacion(Long lugarAplicacion) {
        this.lugarAplicacion = lugarAplicacion;
    }
}
