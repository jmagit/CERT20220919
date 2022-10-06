/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

/**
 *
 * @author Javier
 */
public class CicloDeVida {
    static {
        System.out.println("He cargado e inicializado la clase");
    }

    @PositiveOrZero
    private int id = 99;
    
    public static void cotilla() {
        
    }
    
    public CicloDeVida() {
        System.out.println("He instanciado la clase");
    }
    public int getId() { return id; }
    public void setId(int value) { 
        if (value < 0)
            throw new IllegalArgumentException("Es negativo");
        id = value; 
    }
    private void privado(int value) { 
        if (value < 0)
            throw new IllegalArgumentException("Es negativo");
        id = value; 
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CicloDeVida other = (CicloDeVida) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" + "id=" + id + '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
