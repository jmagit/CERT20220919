package com.example;

/**
 * Clase principal para las demos
 * @author Javier
 * @version 0.1
 */
public class Demos {
    private int algo;
    
    /**
     * Método principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var m = new Demos();
        m.suma(0, 0);
    }
    
    /**
     * Suma de dos enteros
     * @param a operando 1
     * @param b operando 2
     * @return resultado de la suma
     */
    public int suma(int a, int b) {
        return a + b;
    }
    
    public int resta(int a, int b) {
        return a - b;
    }
    
    
}
