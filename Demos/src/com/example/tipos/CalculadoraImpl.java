/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

/**
 *
 * @author Javier
 */
public class CalculadoraImpl implements Calculadora, GraficoImprimible {

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
    @Override
    public double suma(double a, double b) {
        return redondeoIEEE(a + b);
    }

    @Override
    public double resta(double a, double b) {
        return redondeoIEEE(a - b);
    }

    @Override
    public double multiplica(double a, double b) {
        return redondeoIEEE(a * b);
    }

    public int divide(int a, int b) {
        return a / b;
    }

    @Override
    public double divide(double a, double b) {
        return redondeoIEEE(a / b);
    }
    
    public double avg(double a, double b) {
        double rslt = a - b;
        return redondeoIEEE(rslt);
    }
    public double avg(double a, double b, double c) {
        double rslt = a - b - c;
        return redondeoIEEE(rslt);
    }
//    public double avg(double a, double b, double... otros) {
//        double rslt = a + b;
//        for(double valor: otros)
//            rslt += valor;
//        return redondeoIEEE(rslt / (otros.length + 2));
//    }
    public double avg(double... otros) {
        if(otros.length == 0) return 0;
        double rslt = 0;
        for(double valor: otros)
            rslt += valor;
        return redondeoIEEE(rslt / otros.length);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("com.example.tipos.Calculadora.finalize()");
        super.finalize(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void pintate() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void imprimete() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void dime() {
        
    }
}
