/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;


/**
 *
 * @author Javier
 */
public enum DiasLaborables {
    LUNES(1), MARTES(2), MIERCOLES(3), JUEVES(4), VIERNES(5);
    private int valor;

    private DiasLaborables(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public static DiasLaborables getEnum(int valor) {
        return switch (valor) {
            case 1 -> DiasLaborables.LUNES;
            case 2 -> DiasLaborables.MARTES;
            case 3 -> DiasLaborables.MIERCOLES;
            case 4 -> DiasLaborables.JUEVES;
            case 5 -> DiasLaborables.VIERNES;
            default -> throw new IllegalArgumentException();
        };
    }
    
}
