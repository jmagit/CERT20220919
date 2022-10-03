/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

import com.example.exceptions.CalculadoraException;

/**
 *
 * @author Javier
 */
public class Contable extends Persona implements Calculadora {
    private Calculadora calc;
    public Contable(String nombre, String estado) {
        super(1, "", "");
        if(nombre == null)
            throw new IllegalArgumentException("el nombre no puede ser nulo");
        calc = new CalculadoraCientificaImpl();
        assert estado != null : "el estado no puede ser nulo";
   }
    @Override
    public void hacerExamen() {
        System.out.println("Mirar las cuentas");
    }

    @Override
    public double divide(double a, double b) throws CalculadoraException {
        return calc.divide(a, b);
    }

    @Override
    public double multiplica(double a, double b) {
        return calc.multiplica(a, b);
    }

    @Override
    public double resta(double a, double b) {
        return calc.resta(a, b);
    }

    @Override
    public double suma(double a, double b) {
        return calc.suma(a, b);
    }

    @Override
    public double avg(double a, double b) {
        return calc.avg(a, b);
    }
    
}
