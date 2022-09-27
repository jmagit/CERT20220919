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
    Persona lista[];
    
    abstract class Comparador {
        abstract int compara(String s1, String s2);
    }


    public void proceso() {
        final int desc = -1;
        var comp = new Comparador() {
            @Override
            int compara(String s1, String s2) {
                return desc * s1.compareTo(s2);
            }
        };
        ordena(tabla, new Comparador() {
            @Override
            int compara(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        
    }

    public void proceso1() {
        class ComparaBinAsc extends Comparador {
            @Override
            int compara(String s1, String s2) {
                return s1.compareTo(s2);
            }
        }
        var comp = new ComparaBinAsc();
        ordena(tabla, comp);
        
    }
    public void proceso2() {
        class ComparaTexrAsc extends Comparador {
            @Override
            int compara(String s1, String s2) {
                return s1.compareToIgnoreCase(s2);
            }
        }
        var comp = new ComparaTexrAsc();
        ordena(tabla, comp);
        
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

    enum Tipo {
        TEXT, BIN, TEXT_DESC, BIN_DESC
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
