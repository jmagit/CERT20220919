/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author Javier
 */
public class Alumno extends Persona {
//    private final double notas[];
    private final List<Double> notas;

    public Alumno(int id, String nombre) {
        super(id, nombre, "Matriculado");
        notas = new ArrayList<>();
    }
    
    public Alumno(int id, String nombre, int asignaturas) {
        super(id, nombre, "Matriculado");
//        notas = new double[asignaturas];
        notas = new ArrayList<>();
    }
    
    public Alumno(int id, String nombre, String fechaNacimiento, Double... notas) {
        super(id, nombre, "Matriculado");
        setFechaNacimiento(LocalDate.parse(fechaNacimiento));
        this.notas = new ArrayList<> (Stream.of(notas).toList());
    }
    
    public double calificacion() {
        var calc = new CalculadoraImpl();
        return calc.avg(notas.stream().mapToDouble(d -> d).toArray());
    }
    
    public void addNota(double nota) {
        notas.add(nota);
    }
    
    public List<Double> getNotas() {
        return notas;
    }

    @Override
    public void hacerExamen() {
        System.out.println("Responder preguntas");
    }
 
    @Override
    public String toString() {
        return "Alumno{" + "id=" + getId() + ", nombre=" + getNombre() + '}';
   }
   
}
