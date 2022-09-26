/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.tipos;

import org.w3c.dom.Text;

/**
 *
 * @author Javier
 */
public class Delegados {

    String tabla[];

    public void proceso() {
        // ordena(tabla);
    }

    enum Tipo {
        TEXT, BIN, TEXT_DESC, BIN_DESC
    }

    abstract class Comparador {
        abstract int compara(String s1, String s2);
    }

    private void ordena(String[] t, Comparador comp) {
        int n = 0, m = 0;
        // ...
        if (comp.compara(t[n], t[m]) > 0) {

        } else if (comp.compara(t[n], t[m]) < 0) {

        } else {

        }
        // ...
    }

    /*    
    private void ordena(String[] t, Tipo tipo) {
        int n = 0, m = 0;
        // ...
        switch (tipo) {
            case BIN:
                if(t[n] > t[m]) {

                } else if(t[n] < t[m]) {

                } else {

                }
                break;
            default:
                throw new AssertionError();
        }
        // ...
    }

    private void ordena(String[] t) {
        int n = 0, m = 0;
        // ...
        if(t[n] > t[m]) {
            
        } else if(t[n] < t[m]) {
            
        } else {
            
        }
        // ...
    }
    
    private void ordenaText(String[] t) {
        int n = 0, m = 0;
        // ...
        if(t[n] < t[m]) {
            
        } else if(t[n] > t[m]) {
            
        } else {
            
        }
        // ...
    }
     */
}
