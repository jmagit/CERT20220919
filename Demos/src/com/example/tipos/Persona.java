/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

import com.example.exceptions.DemosException;
import com.example.exceptions.InvalidDataException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

/**
 *
 * @author Javier
 */
public abstract class Persona implements Comparable<Persona>{
    public static final int EDAD_JUBILACION = 67;
    public final String estado ;
    
    private int id;
    private String nombre;
    private LocalDate fechaNacimiento;
    private LocalDate fechaBaja;
    private transient int edad = -1;
    private boolean activo = true;

    public Persona() {
        this(0, "Anonimo", "sin estado");
        fechaBaja = null;
    }
    public Persona(int id) {
        setId(id);
        this.estado = "sin estado";
    }
    
    public Persona(int id, String nombre, String estado) {
        setId(id);
        if(nombre == null)
            throw new IllegalArgumentException("el nombre no puede ser nulo");
        assert estado != null;
        this.nombre = nombre;
        this.estado = estado;
    }
    
    public abstract void hacerExamen();
    
    public int getId() {
        return id;
    }
    
    public void setId(int valor) {
        if(valor == id) return;
        if(valor <= 0)
            throw new IllegalArgumentException("El identificador deber mayor que 0");
        id = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public boolean hasFechaNacimiento() {
        return fechaNacimiento != null;
    }

    public LocalDate getFechaNacimiento() throws DemosException {
        if(fechaNacimiento == null)
           throw new DemosException("No tengo la fecha de nacimiento");
        return fechaNacimiento;
    }

    public Optional<LocalDate> dameFechaNacimiento() {
        return Optional.ofNullable(fechaNacimiento);
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        var hoy = LocalDate.now();
        if(fechaNacimiento == null || fechaNacimiento.isAfter(hoy))
            throw new IllegalArgumentException("Tiene que ser una fecha pasada");
        this.fechaNacimiento = fechaNacimiento;
        this.edad = (int)fechaNacimiento.until(hoy, ChronoUnit.YEARS);
        assert edad >= 0;
    }
    
    public int getEdad() {
        if(edad == -1)
            throw new InvalidDataException("No conozco la fecha de nacimiento");
        return edad;
    }
    
    public void jubilate() {
        activo = false;
        fechaBaja = LocalDate.now();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
        if (!(obj instanceof Persona)) {
            return false;
        }
        final Persona other = (Persona) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(Persona o) {
        return edad - o.edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "estado=" + estado + ", id=" + id + ", nombre=" + nombre + ", activo=" + activo + '}';
    }
    
}
