package com.example.proyectofinal.models;

public class Incendio {
    private String usuario;
    private  String severidad;
    private String canton;
    private String distrito;
    private String fecha;
    private String estado;

    public Incendio(String incendio) {
    }

    public Incendio(String usuario, String severidad, String canton, String distrito, String fecha, String estado) {
        this.usuario = usuario;
        this.severidad = severidad;
        this.canton = canton;
        this.distrito = distrito;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSeveridad() {
        return severidad;
    }

    public void setSeveridad(String severidad) {
        this.severidad = severidad;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

