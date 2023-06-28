package com.backfranco.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idExp;
    private String tituloExp;
    private int fechaExp;
    private int fechaFinExp;
    private String descripcionExp;
    private String imagenExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, int fechaExp, int fechaFinExp, String descripcionExp, String imagenExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExp = fechaExp;
        this.fechaFinExp = fechaFinExp;
        this.descripcionExp = descripcionExp;
        this.imagenExp = imagenExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(int fechaExp) {
        this.fechaExp = fechaExp;
    }

    public int getFechaFinExp() {
        return fechaFinExp;
    }

    public void setFechaFinExp(int fechaFinExp) {
        this.fechaFinExp = fechaFinExp;
    }

    public String getDescripcionExp() {
        return descripcionExp;
    }

    public void setDescripcionExp(String descripcionExp) {
        this.descripcionExp = descripcionExp;
    }

    public String getImagenExp() {
        return imagenExp;
    }

    public void setImagenExp(String imagenExp) {
        this.imagenExp = imagenExp;
    }
}
