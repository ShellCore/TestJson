package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class VacunadoAsociado  {
    @Expose
    @SerializedName("_id")
    private String _id;

    @Expose
    @SerializedName("id_vacunaccion")
    private String id_vacunaccion;

    @Expose
    @SerializedName("id_usuario_vac")
    private String id_usuario_vac;

    @Expose
    @SerializedName("nombre")
    private String nombre;

    @Expose
    @SerializedName("primer_apellido")
    private String primer_apellido;

    @Expose
    @SerializedName("segundo_apellido")
    private String segundo_apellido;

    @Expose
    @SerializedName("id_nacionalidad")
    private Long id_nacionalidad;

    @Expose
    @SerializedName("id_estado_nacimiento")
    private Long id_estado_nacimiento;

    @Expose
    @SerializedName("fecha_nacimiento")
    private String fecha_nacimiento;

    @Expose
    @SerializedName("sexo")
    private String sexo;

    @Expose
    @SerializedName("curp")
    private String curp;

    @Expose
    @SerializedName("fecha_registro_app")
    private String fecha_registro_app;

    @Expose
    @SerializedName("fecha_registro")
    private String fecha_registro;

    @Expose
    @SerializedName("estado_validacion")
    private Long estado_validacion;

    @Expose
    @SerializedName("id_origen_registro")
    private Long id_origen_registro;

    @Expose
    @SerializedName("id_estatus")
    private Integer id_estatus;

    @Expose
    private Boolean gemelo;

    @Expose
    private Boolean bidireccional;

    //  @Expose
    @SerializedName("__v")
    private Long __v;

    @Expose
    @SerializedName("responsables")
    private List<ResponsableVacunadoAsociado> responsables;

    @SerializedName("doctores")
    private List<DoctorVacunadoAsociado> doctores;

    @Expose
    @SerializedName("direcciones")
    private List<DireccionVacunadoAsociado> direcciones;

    @Expose
    @SerializedName("vacunas")
    private List<Vacuna> vacunas;

    private List<String> contraindicaciones;

    private List<String> factorRiesgo;

    private List<String> listNfc;

    private List<String> vacunaPreguntas;

    @Expose
    private List<Afiliacion> listAfiliciones;

    private List<String> listResponsableCev;

    private List<String> bitVacunasNoAplicadas;







    @Expose
    private Boolean gemelos;
    //@Expose
    @SerializedName("fecha_ultimo_movimiento")
    private Date fecha_ultimo_movimiento;


    @Expose
    @SerializedName("id_dispositivo")
    private String id_dispositivo;

    @Expose
    @SerializedName("id_autonumerico")
    private Integer id_autonumerico;

    @Expose
    @SerializedName("id_tipo_sangre")
    private Integer id_tipo_sangre;

    @Expose
    @SerializedName("fecha_autorizacion")
    private String fecha_autorizacion;

    @Expose
    @SerializedName("img")
    private String img;

    @Expose
    @SerializedName("id_vacunado_cev")
    private Long idVacunadoCev;

    private String rfc_cev;

    //TODO BORRAR CAMPO EN EL SIGUIENTE LIMPIEZA DE REGISTRO
    private List<String> listBitVacunasNoAplicadas;

    private List<String> listResponsable;


    private List<String> afiliaciones;

    private String correo_cev;

    @Expose
    @SerializedName("id_clues_cev")
    private Integer id_clues_cev;

    @Expose
    private Integer id_clues_seguimiento;

    @Expose
    private String fecha_registro_seguimineto;

    @Expose
    private String certificado_nacimiento;

    @Expose
    private Long idUsuario;

    @Expose
    private Long idUsuarioCev;

    @Expose
    private Long numeroInstalacionCev;

    @Expose
    private Long idTabletaCev;

    public Boolean getBidireccional() {
        return bidireccional;
    }

    public void setBidireccional(Boolean bidireccional) {
        this.bidireccional = bidireccional;
    }

    public String getId_usuario_vac() {
        return id_usuario_vac;
    }

    public void setId_usuario_vac(String id_usuario_vac) {
        this.id_usuario_vac = id_usuario_vac;
    }

    public String getCorreo_cev() {
        return correo_cev;
    }

    public void setCorreo_cev(String correo_cev) {
        this.correo_cev = correo_cev;
    }

    public int getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(int id_estatus) {
        this.id_estatus = id_estatus;
    }

    public String getRfc_cev() {
        return rfc_cev;
    }

    public void setRfc_cev(String rfc_cev) {
        this.rfc_cev = rfc_cev;
    }

    public List<String> getListBitVacunasNoAplicadas() {
        return listBitVacunasNoAplicadas;
    }

    public void setListBitVacunasNoAplicadas(List<String> listBitVacunasNoAplicadas) {
        this.listBitVacunasNoAplicadas = listBitVacunasNoAplicadas;
    }

    public List<String> getBitVacunasNoAplicadas() {
        return bitVacunasNoAplicadas;
    }

    public void setBitVacunasNoAplicadas(List<String> bitVacunasNoAplicadas) {
        this.bitVacunasNoAplicadas = bitVacunasNoAplicadas;
    }

    public List<String> getListResponsable() {
        return listResponsable;
    }

    public void setListResponsable(List<String> listResponsable) {
        this.listResponsable = listResponsable;
    }

    public List<Afiliacion> getListAfiliciones() {
        return listAfiliciones;
    }

    public void setListAfiliciones(List<Afiliacion> listAfiliciones) {
        this.listAfiliciones = listAfiliciones;
    }

    public List<String> getAfiliaciones() {
        return afiliaciones;
    }

    public void setAfiliaciones(List<String> afiliaciones) {
        this.afiliaciones = afiliaciones;
    }

    public List<String> getVacunaPreguntas() {
        return vacunaPreguntas;
    }

    public void setVacunaPreguntas(List<String> vacunaPreguntas) {
        this.vacunaPreguntas = vacunaPreguntas;
    }

    public List<String> getListNfc() {
        return listNfc;
    }

    public void setListNfc(List<String> listNfc) {
        this.listNfc = listNfc;
    }

    public List<String> getFactorRiesgo() {
        return factorRiesgo;
    }

    public void setFactorRiesgo(List<String> factorRiesgo) {
        this.factorRiesgo = factorRiesgo;
    }

    public List<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<String> telefonos) {
        this.telefonos = telefonos;
    }

    private List<String> telefonos;

    private boolean status_calendar;

    public String getId() {
        return _id;
    }

    public void setId(String _id) {
        this._id = _id;
    }

    public long getIdNacionalidad() {
        return id_nacionalidad;
    }

    public void setIdNacionalidad(long id_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
    }

    public long getIdEstadoNacimiento() {
        return id_estado_nacimiento;
    }

    public void setIdEstadoNacimiento(long id_estado_nacimiento) {
        this.id_estado_nacimiento = id_estado_nacimiento;
    }

    public long getIdOrigenRegistro() {
        return id_origen_registro;
    }

    public void setIdOrigenRegistro(long id_origen_registro) {
        this.id_origen_registro = id_origen_registro;
    }

    public String getIdVacunaccion() {
        return id_vacunaccion;
    }

    public void setIdVacunaccion(String id_vacunaccion) {
        this.id_vacunaccion = id_vacunaccion;
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

    public String getFechaRegistroApp() {
        return fecha_registro_app;
    }

    public void setFechaRegistroApp(String fecha_registro_app) {
        this.fecha_registro_app = fecha_registro_app;
    }

    public String getFechaRegistro() {
        return fecha_registro;
    }

    public void setFechaRegistro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public void setFechaNacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getFechaAutorizacion() {
        return fecha_autorizacion;
    }

    public void setFechaAutorizacion(String fecha_autorizacion) {
        this.fecha_autorizacion = fecha_autorizacion;
    }

    public long getEstadoValidacion() {
        return estado_validacion;
    }

    public void setEstadoValidacion(long estado_validacion) {
        this.estado_validacion = estado_validacion;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public long getV() {
        return __v;
    }

    public void setV(long __v) {
        this.__v = __v;
    }

    public Date getFechaUltimoMovimiento() {
        return fecha_ultimo_movimiento;
    }

    public void setFechaUltimoMovimiento(Date fecha_ultimo_movimiento) {
        this.fecha_ultimo_movimiento = fecha_ultimo_movimiento;
    }

    public ArrayList<Vacuna> getVacunas() {
        return new ArrayList(Arrays.asList(vacunas.toArray(new Vacuna[vacunas.size()])));
    }

    public void setVacunas(ArrayList<Vacuna> vacunas) {
        this.vacunas = vacunas;
    }

    public ArrayList<DireccionVacunadoAsociado> getDirecciones() {
        return new ArrayList(Arrays.asList(direcciones.toArray(new DireccionVacunadoAsociado[direcciones.size()])));
    }

    public void setDirecciones(List<DireccionVacunadoAsociado> direcciones) {
        this.direcciones = direcciones;
    }

    public List<DoctorVacunadoAsociado> getDoctores() {
        return doctores;
    }

    public void setDoctores(List<DoctorVacunadoAsociado> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<ResponsableVacunadoAsociado> getResponsables() {
        return new ArrayList(Arrays.asList(responsables.toArray(new ResponsableVacunadoAsociado[responsables.size()])));
    }

    public void setResponsables(ArrayList<ResponsableVacunadoAsociado> responsables) {
        this.responsables = responsables;
    }

    public boolean isStatusCalendar() {
        return status_calendar;
    }

    public void setStatusCalendar(boolean status_calendar) {
        this.status_calendar = status_calendar;
    }

    public String getId_dispositivo() {
        return id_dispositivo;
    }

    public void setId_dispositivo(String id_dispositivo) {
        this.id_dispositivo = id_dispositivo;
    }

    public int getId_autonumerico() {
        return id_autonumerico;
    }

    public void setId_autonumerico(int id_autonumerico) {
        this.id_autonumerico = id_autonumerico;
    }

    public int getId_tipo_sangre() {
        return id_tipo_sangre;
    }

    public void setId_tipo_sangre(int id_tipo_sangre) {
        this.id_tipo_sangre = id_tipo_sangre;
    }

    public List<String> getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(List<String> contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public List<String> getListResponsableCev() {
        return listResponsableCev;
    }

    public void setListResponsableCev(List<String> listResponsableCev) {
        this.listResponsableCev = listResponsableCev;
    }

    public Long getIdVacunadoCev() {
        return idVacunadoCev;
    }

    public void setIdVacunadoCev(Long idVacunadoCev) {
        this.idVacunadoCev = idVacunadoCev;
    }

    public Boolean getGemelos() {
        return gemelos;
    }

    public void setGemelos(Boolean gemelos) {
        this.gemelos = gemelos;
    }

    public Integer getIdCluesCev() {
        return id_clues_cev;
    }

    public void setIdCluesCev(Integer id_clues_cev) {
        this.id_clues_cev = id_clues_cev;
    }

    public Integer getIdCluesSeguimiento() {
        return id_clues_seguimiento;
    }

    public void setIdCluesSeguimiento(Integer id_clues_seguimiento) {
        this.id_clues_seguimiento = id_clues_seguimiento;
    }

    public String getFechaRegistroSeguimineto() {
        return fecha_registro_seguimineto;
    }

    public void setFechaRegistroSeguimineto(String fecha_registro_seguimineto) {
        this.fecha_registro_seguimineto = fecha_registro_seguimineto;
    }

    public String getCertificadoNacimiento() {
        return certificado_nacimiento;
    }

    public void setCertificadoNacimiento(String certificado_nacimiento) {
        this.certificado_nacimiento = certificado_nacimiento;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getIdUsuarioCev() {
        return idUsuarioCev;
    }

    public void setIdUsuarioCev(Long idUsuarioCev) {
        this.idUsuarioCev = idUsuarioCev;
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

    public Boolean getGemelo() {
        return gemelo;
    }

    public void setGemelo(Boolean gemelo) {
        this.gemelo = gemelo;
    }
}
