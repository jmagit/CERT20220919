/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.tipos;

import com.example.exceptions.CalculadoraException;

/**
 *
 * @author Javier
 */
public interface Calculadora {

    double divide(double a, double b) throws CalculadoraException;

    double multiplica(double a, double b);

    double resta(double a, double b);

    double suma(double a, double b);
    double avg(double a, double b);
    
}
