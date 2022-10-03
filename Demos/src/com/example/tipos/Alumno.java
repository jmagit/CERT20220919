/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

import java.util.ArrayList;
import java.util.List;

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
    
    public double calificacion() {
        var calc = new CalculadoraImpl();
        return 0; // calc.avg((double[])notas.toArray());
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
