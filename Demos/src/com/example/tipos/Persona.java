/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

import java.time.LocalDate;

/**
 *
 * @author Javier
 */
public abstract class Persona {
    public static final int EDAD_JUBILACION = 67;
    public final String estado ;
    
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private transient int edad;
    private boolean activo = true;

    public Persona() {
        this(0, "Anonimo", "sin estado");
        fechaBaja = null;
    }
    public Persona(int id, String nombre, String estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int valor) {
        if(valor == id) return;
        if(valor <= 0)
            throw new IllegalArgumentException("El identificador deber mayor que 0");
        id = valor;
    }

    public boolean isActivo() {
        return activo;
    }

    protected void setActivo(boolean valor) {
        activo = valor;
    }

    public boolean isJubilado() {
        return !activo && edad >= EDAD_JUBILACION;
    }
    
    public void jubilate() {
        activo = false;
        fechaBaja = LocalDate.now();
    }
}
