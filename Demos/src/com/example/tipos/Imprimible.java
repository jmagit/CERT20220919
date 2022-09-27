/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.tipos;

/**
 *
 * @author Javier
 */
public interface Imprimible {
    void imprimete();
    void pintate();
    default void dime() {
        System.out.println("Otra cosa");
        imprimete();
    }
}
