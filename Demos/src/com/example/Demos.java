package com.example;

import com.example.tipos.DiasDeLaSemana;
import com.example.tipos.DiasLaborables;
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

    public double redondeoIEEE(double value) {
        return (new java.math.BigDecimal(value)).setScale(15, java.math.RoundingMode.HALF_DOWN).doubleValue();
    }

    /**
     * Método principal
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var m = new Demos();
        m.tipos();
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

    public void tipos() {
        DiasDeLaSemana d = DiasDeLaSemana.LUNES;
        if(d == DiasDeLaSemana.DOMINGO) {}
         System.out.println(d);
         d = DiasDeLaSemana.valueOf("DOMINGO");
         System.out.println(d);
       
        // d = DiasLaborables.LUNES;
        DiasLaborables dia = DiasLaborables.JUEVES;
        int i = dia.getValor();
        System.out.println(i);
        dia = DiasLaborables.getEnum(2);
        System.out.println(dia);
    }
    public void flujo() {
        int i = 22;
        int rslt = 0;
        switch (i) {
            case 3:
                rslt++;
                System.out.println("tres");
            case 2, 22:
                rslt++;
                System.out.println("dos");
            case 1:
            case 11:
                System.out.println("uno");
                rslt++;
            // break;
//            default:
//                System.out.println("Otros");
        }
        System.out.println(rslt);
        System.out.println(redondeoIEEE(0.1 + 0.2));
        System.out.println(redondeoIEEE(1.0 - 0.9));

        String s;
        i = 2;
        s = switch (i) {
            case 0:
                yield "ningun";
            case 1:
                yield "un";
            case 2:
                yield "dos";
            default:
                yield "muchos";
        } + " elemento" + (i > 1 ? "s" : "");

        s = switch (i) {
            case 0 ->
                "ningun";
            case 1 ->
                "un";
            case 2 ->
                "dos";
            default ->
                "muchos";
        }
                + " elemento" + (i > 1 ? "s" : "");

        System.out.println(s);
//        Object o = null;
//        s = switch(o) {
//            case null: yield "vacio";
//            case String cad: yield "cadena: " + cad;
//            case Integer ent: yield "entero: " + ent.toString();
//            default: yield "no se";
//        } + " tipo";
//        System.out.println(s);
        int t[] = {1, 2, 3, 4, 5};
//        for(int ind = 0, factor = 10; ind < t.length; ind++, factor--) {
//            System.out.println(ind + "->" + t[ind] * factor);
//        }
        for (int ind = 0; ind < t.length; ind += 2) {
            System.out.println(ind + "->" + t[ind]);
        }
        for (int ele : t) {
            System.out.println(ele);
        }

//        padre:
//        while (true) {
//            switch (i) {
//                case 3:
//                    rslt++;
//                    System.out.println("tres");
//                case 2, 22:
//                    rslt++;
//                    System.out.println("dos");
//                case 1:
//                case 11:
//                    System.out.println("uno");
//                    rslt++;
//                    break padre;
//            }
//
//            while (true) {
//                // ...
//                if (cond) {
//                    break;
//                }
//                // ...
//                if (cond2) {
//                    break padre;
//                }
//                // ...
//                if (cond) {
//                    continue;
//                }
//                if (cond2) {
//                    continue;
//
//                }
//                if (cond3) {
//                    continue;
//                }
//            }
//        }
    }

    public void operadores() {
        int i, j;
        j = i = 1;
        double d = divide((double) i, 0) * 0;
//        System.out.println(i + " " + j);
        System.out.println(d * 2 + 1);
        d = 0.1 + 0.2;
//        if(d == 0.3) {
//           System.out.println("Si"); 
//        } else {
//           System.out.println("NO, es " + (1 - 0.9)); 
//        }
        System.out.println(d == 0.3 ? "Si" : "No, es " + d);
        boolean b;
        System.out.println((b = true) ? "Si" : "No, es " + d);
        if (b == false) {

        }
        if (!b) {

        }
        Boolean bb = null;
        if (bb == false) { // bb != null && !bb

        }

        i++;
        ++i;
        System.out.println("Auto: " + i++ + " " + i + " " + ++i);
        i += 2; // i = i + 2;
        Object o = "Hola mundo";
        o = 4;
        if (o instanceof String) {
            String s = (String) o;
            System.out.println((s != null && s.length() > 5) ? "Si" : "No");
        }
        if (o instanceof String s) {
            System.out.println((s != null && s.length() > 5) ? "Si" : "No");
        }

    }

    public int divide(int a, int b) {
        return a / b;
    }

    public double divide(double a, double b) {
        return a / b;
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
        int v2[] = {1, 2, 3};
        v2 = new int[]{1, 2, 3};
        int[][] m2 = new int[][]{{0, 0}, {1, 2, 3}, {1, 7}};

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
