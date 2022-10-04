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
public class Profesor extends Persona{
    private double salario;
    public Profesor() {}
    public Profesor(int id, String nombre, double salario) {
        super(id, nombre, "En activo");
        this.salario = salario;
        // ...
    }
    public Profesor(int id, String nombre, String fechaNacimiento, double salario) {
        super(id, nombre, "En activo");
        this.salario = salario;
        setFechaNacimiento(LocalDate.parse(fechaNacimiento));
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
