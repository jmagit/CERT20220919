package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal para las demos
 *
 * @author Javier
 * @version 0.1
 */
public class Demos {

    private int algo;

    /**
     * Método principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var m = new Demos();
        m.tablas();
    }

    public void ejemplos1() {
        int i, j, k = 0;
        j = 0;
        i = j + k;
        final int id;
        id = i + 23 * j * k;

        boolean b = true;
        b = false;
        b = i < j;

        char a = '9';
        a = (char) (a + 1);
        System.out.println(a);
        i = '2' + 1;
        a = '9';
        i = (a - '0') + 1;
        System.out.println(i);

        String s = "cadena", ss = null;
        System.out.println(s.length());

        var x = 4;
        var xx = "4";
        x = 4;
        Demos l = new Demos();
        if (true) {
            var x1 = "ff";
            x1 = s;
        }

        short peque = 1;
        int grande = 1;

        grande = peque;
        peque = (short) grande;
        s = "4";
        i = Integer.parseInt(s);

        List<String> list = new ArrayList<String>();
//        if(list instanceof ArrayList) {
        ((ArrayList) list).clear();
//        }
        Object o = null;
        o = "dd";
        o = list;
        o = 4; // new Integer(4)
        System.out.println(o.getClass().getName());
        i = (int) o; // o.getValue()
        System.out.println(i);
        Short conNulo = 0;
        conNulo = null;
        i = conNulo + 1;
        peque = conNulo;
    }

    public void tablas() {
        int[] v = new int[10];
        int i;
        i = v[0];
        i = v[v.length - 1];
        v = new int[20];
        int[][] m = new int[10][10];
        m[0][0] = 4;
        m[0] = new int[5];
        m[1] = null;
        var aux = m[1];
        m[1] = m[2];
        m[2] = aux;
        m = new int[7][];
        m[0] = new int[5];
        m[1] = new int[7];
        m[2] = new int[3];
        i = m[3][1];
        int v2[] = { 1, 2, 3};
        v2 = new int[]{ 1, 2, 3};
        int[][] m2 = {{0,0}, {1,2,3}, {1,7}};
        
    }

    /**
     * Suma de dos enteros
     *
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

    public java.util.List kk() {
        return null;
    }
}
