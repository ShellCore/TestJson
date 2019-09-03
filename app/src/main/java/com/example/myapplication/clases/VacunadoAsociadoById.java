package com.example.myapplication.clases;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class VacunadoAsociadoById {

    @Expose
    @SerializedName("numero_instalacion_cev")
    private long numeroInstalacionCev;

    @Expose
    @SerializedName("id_tableta_cev")
    private long idTabletaCev;

    @Expose
    @SerializedName("id_vacunado_cev")
    private Long idVacunadoCev;

    @Expose
    @SerializedName("id_clues_cev")
    private long idCluesCev;

    @Expose
    @SerializedName("_id")
    private String _id;

    @Expose
    @SerializedName("id_estatus")
    private int id_estatus;

    @Expose
    @SerializedName("id_dispositivo")
    private String id_dispositivo;

    @Expose
    @SerializedName("id_autonumerico")
    private int id_autonumerico;

    @Expose
    @SerializedName("id_tipo_sangre")
    private Integer id_tipo_sangre;

    @Expose
    @SerializedName("id_nacionalidad")
    private long id_nacionalidad;

    @Expose
    @SerializedName("id_estado_nacimiento")
    private long id_estado_nacimiento;

    @Expose
    @SerializedName("id_origen_registro")
    private long id_origen_registro;

    @Expose
    @SerializedName("id_vacunaccion")
    private String id_vacunaccion;

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
    @SerializedName("sexo")
    private String sexo;

    @Expose
    @SerializedName("curp")
    private String curp;

    @Expose
    @SerializedName("fecha_registro_app")
    private Date fechaRegistroApp;

    @Expose
    @SerializedName("fecha_registro")
    private Date fechaRegistro;

    @Expose
    @SerializedName("fecha_nacimiento")
    private String fecha_nacimiento;

    @Expose
    @SerializedName("fecha_autorizacion")
    private String fecha_autorizacion;

    @Expose
    @SerializedName("estado_validacion")
    private long estado_validacion;

    @Expose
    @SerializedName("img")
    private String img;

    //  @Expose
    @SerializedName("__v")
    private long __v;

    //@Expose
    @SerializedName("fecha_ultimo_movimiento")
    private Date fechaUltimoMovimiento;

    @Expose
    @SerializedName("vacunas")
    private List<Vacuna> vacunas;

    @Expose
    @SerializedName("direcciones")
    private List<DireccionVacunadoAsociado> direcciones;

    @SerializedName("doctores")
    private List<String> doctores;

    @Expose
    @SerializedName("responsables")
    private List<ResponsableVacunadoAsociadoById> responsables;

    private String rfc_cev;

    private List<String> listBitVacunasNoAplicadas;

    private List<String> listResponsable;

    private List<Afiliacion> listAfiliciones;

    private List<String> vacunaPreguntas;

    private List<String> listNfc;

    private List<String> factorRiesgo;

    private List<String> bitVacunasNoAplicadas;

    private List<String> contraindicaciones;

    private List<AfiliacionBiDiCEV> listResponsableCev;

    private List<AfiliacionIN> afiliaciones;

    @Expose
    @SerializedName("certificado_nacimiento")
    private String certificadoNacimiento;

    @Expose
    @SerializedName("gemelo")
    private String gemelo;

    public String getCorreo_cev() {
        return correo_cev;
    }

    public void setCorreo_cev(String correo_cev) {
        this.correo_cev = correo_cev;
    }
    /* public List<VacunadoAsociadoById> getVacunado() {
         return vacunado;
     }

     public void List(List<VacunadoAsociadoById> vacunado) {
         this.vacunado = vacunado;
     }*/
    private String correo_cev;

    public Long getIdVacunadoCev() {
        return idVacunadoCev;
    }

    public void setIdVacunadoCev(Long idVacunadoCev) {
        this.idVacunadoCev = idVacunadoCev;
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

    public Date getFechaRegistroApp() {
        return fechaRegistroApp;
    }

    public void setFechaRegistroApp(Date fechaRegistroApp) {
        this.fechaRegistroApp = fechaRegistroApp;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
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
        return fechaUltimoMovimiento;
    }

    public void setFechaUltimoMovimiento(Date fechaUltimoMovimiento) {
        this.fechaUltimoMovimiento = fechaUltimoMovimiento;
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

    public List<String> getDoctores() {
        return doctores;
    }

    public void setDoctores(List<String> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<ResponsableVacunadoAsociadoById> getResponsables() {
        return new ArrayList(Arrays.asList(responsables.toArray(new ResponsableVacunadoAsociadoById[responsables.size()])));
    }

    public void setResponsables(ArrayList<ResponsableVacunadoAsociadoById> responsables) {
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

    public int getId_estatus() {
        return id_estatus;
    }

    public void setId_estatus(int id_estatus) {
        this.id_estatus = id_estatus;
    }

    public Integer getId_tipo_sangre() {
        return id_tipo_sangre;
    }

    public void setId_tipo_sangre(Integer id_tipo_sangre) {
        this.id_tipo_sangre = id_tipo_sangre;
    }

    public List<String> getBitVacunasNoAplicadas() {
        return bitVacunasNoAplicadas;
    }

    public void setBitVacunasNoAplicadas(List<String> bitVacunasNoAplicadas) {
        this.bitVacunasNoAplicadas = bitVacunasNoAplicadas;
    }

    public List<String> getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(List<String> contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public List<AfiliacionBiDiCEV> getListResponsableCev() {
        return listResponsableCev;
    }

    public void setListResponsableCev(List<AfiliacionBiDiCEV> listResponsableCev) {
        this.listResponsableCev = listResponsableCev;
    }

    public List<AfiliacionIN> getAfiliaciones() {
        return afiliaciones;
    }

    public void setAfiliaciones(List<AfiliacionIN> afiliaciones) {
        this.afiliaciones = afiliaciones;
    }

    public long getNumeroInstalacionCev() {
        return numeroInstalacionCev;
    }

    public void setNumeroInstalacionCev(long numeroInstalacionCev) {
        this.numeroInstalacionCev = numeroInstalacionCev;
    }

    public long getIdTabletaCev() {
        return idTabletaCev;
    }

    public void setIdTabletaCev(long idTabletaCev) {
        this.idTabletaCev = idTabletaCev;
    }

    public long getIdCluesCev() {
        return idCluesCev;
    }

    public void setIdCluesCev(long idCluesCev) {
        this.idCluesCev = idCluesCev;
    }

    public String getCertificadoNacimiento() {
        return certificadoNacimiento;
    }

    public void setCertificadoNacimiento(String certificadoNacimiento) {
        this.certificadoNacimiento = certificadoNacimiento;
    }

    public String getGemelo() {
        return gemelo;
    }

    public void setGemelo(String gemelo) {
        this.gemelo = gemelo;
    }
}
