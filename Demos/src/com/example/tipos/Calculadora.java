/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

/**
 *
 * @author Javier
 */
public class Calculadora {

    private static double redondeoIEEE(double value) {
        return (new java.math.BigDecimal(value)).setScale(15, java.math.RoundingMode.HALF_DOWN).doubleValue();
    }

    /**
     * Suma de dos enteros
     *
     * @param a operando 1
     * @param b operando 2
     * @return resultado de la suma
     */
    public double suma(double a, double b) {
        return redondeoIEEE(a + b);
    }

    public double resta(double a, double b) {
        return redondeoIEEE(a - b);
    }

    public double multiplica(double a, double b) {
        return redondeoIEEE(a * b);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static double divide(double a, double b) {
        return redondeoIEEE(a / b);
    }
    
    public double avg(double a, double b, double... otros) {
        double rslt = a + b;
        for(double valor: otros)
            rslt += valor;
        return redondeoIEEE(rslt / (otros.length + 2));
    }
    public double avg(double a, double b) {
        double rslt = a - b;
        return redondeoIEEE(rslt);
    }
    public double avg(double a, double b, double c) {
        double rslt = a - b - c;
        return redondeoIEEE(rslt);
    }

}
