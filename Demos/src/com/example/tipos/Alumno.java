/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

/**
 *
 * @author Javier
 */
public class Alumno extends Persona {
    private final double notas[];
    
    public Alumno(int asignaturas) {
        notas = new double[asignaturas];
    }
    
    public double calificacion() {
        var calc = new CalculadoraImpl();
        return calc.avg(notas);
    }

    @Override
    public void hacerExamen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
