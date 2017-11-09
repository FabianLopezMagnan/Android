package com.example.fabianlopezmagnan.horoscopo;

import java.io.Serializable;

/**
 * Created by Fabian on 04-11-2017.
 */

public class User implements Serializable {
    private String nombre;
    private String clave;
    private int anio;

    public User() {

    }

    public User(String nombre, String clave, int anio) {
        this.nombre = nombre;
        this.clave = clave;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
