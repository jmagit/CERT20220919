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
        super(id, nombre, "En activo");
        this.salario = salario;
        // ...
    }

    private double finiquito;
    
    @Override
    public void jubilate() {
        
        // ...
        super.jubilate();
    }

    @Override
    public void setActivo(boolean valor) {
        super.setActivo(valor);
    }

    
    @Override
    public void hacerExamen() {
        System.out.println("Preparar preguntas");
    }

    @Override
    public String toString() {
        return "Profesor{" + "id=" + getId() + ", nombre=" + getNombre() + '}';
   }
    
    
}
