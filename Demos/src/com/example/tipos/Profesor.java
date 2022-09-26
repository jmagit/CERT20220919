/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

/**
 *
 * @author Javier
 */
public class Profesor extends Persona{
    private double salario;
    public Profesor() {}
    public Profesor(int id, String nombre, double salario) {
        super(id, nombre, "Profe");
        this.salario = salario;
        // ...
    }
    private double finiquito;
    
    public void jubilate() {
        
        // ...
        super.jubilate();
    }

    @Override
    public void setActivo(boolean valor) {
        super.setActivo(valor); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    @Override
    public void hacerExamen() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
