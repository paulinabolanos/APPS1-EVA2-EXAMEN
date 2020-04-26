package com.example.eva2_examen_apps1;

import java.io.Serializable;

public final class Restaurante implements Serializable {
    private int imagen;
    private String nombre;
    private String descripcion;
    private String direccion;
    private String telefono;
    private int calif;


    public Restaurante(int imagen, String nombre,  String descripcion, String direccion, String telefono, int calif) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.calif = calif;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDireccion() { return direccion; }

    public void setDireccion(String direccionYTel) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }

    public void setTelefono(String telefono) { this.telefono = telefono; }

    public int getCalificacion() {
        return calif;
    }

    public void setCalificacion(int evaluacion) {
        this.calif = calif;
    }
}
