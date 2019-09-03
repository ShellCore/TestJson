package com.example.myapplication.clases;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class JsonVacunadoResponse {
    @SerializedName("success")
    private boolean success;

    @SerializedName("code")
    private long code;

    @SerializedName("data")
    private List<VacunadoAsociado> vacunado;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public List<VacunadoAsociado> getVacunado() {
        return vacunado;
    }

    public void setVacunado(List<VacunadoAsociado> vacunado) {
        this.vacunado = vacunado;
    }
}
