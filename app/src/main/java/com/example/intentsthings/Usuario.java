package com.example.intentsthings;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String dni;
    private String correo;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String telf;
    private boolean casado;


    public Usuario() {
    }

    public Usuario(String dni, String correo, String contrasenia, String nombre, String apellido, String telf, boolean casado) {
        this.dni = dni;
        this.correo = correo;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telf = telf;
        this.casado = casado;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
