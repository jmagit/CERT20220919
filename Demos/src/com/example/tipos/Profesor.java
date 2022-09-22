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
    public Profesor() {}
    public Profesor(int id, String nombre) {
        super(id, nombre, "Profe");
    }
    private double finiquito;
    
    public void jubilate() {
        
        // ...
        super.jubilate();
    }
}
