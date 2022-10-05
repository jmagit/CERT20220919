package com.example;

import com.example.juegos.Juego;
import com.example.juegos.JuegoException;
import com.example.juegos.naipes.BarajaFrancesa;
import com.example.juegos.naipes.ValorNaipe;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Javier
 */
public class Ejercicios {

    @SuppressWarnings("resource")
    private static final Scanner teclado = new Scanner(System.in);
    private static final PrintStream out = new PrintStream(System.out, true, StandardCharsets.UTF_8);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var app = new Ejercicios();
//        app.juego();
//        app.juegoConClase();
//        app.decode("3+4+3,4-7*1=");
//        try {
////            app.calcula("3+4+3,4-7*1=");
////            app.calcula("0,1+0,2+0,7-0,9=");
//            app.calculaList("3+4+3,4-7*1=");
//            app.calculaList("25+43-37*88/9,9=");
//        } catch (CalculadoraException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        app.naipes();
    }

    /**
     * Juego de “Adivina el número que estoy pensando”, un número del 0 al 100,
     * ya te diré si es mayor o menor que el mío, pero tienes 10 intentos como
     * mucho.
     */
    public void juego() {
        final int numeroBuscado = (new Random()).nextInt(100) + 1;
        int numeroIntroducido;
        int intentos = 0;
        boolean encontrado = false;
        do {
            try {
                intentos += 1;
                out.print("Dame tu número del 1 al 100 (" + intentos + " de 10): ");
//                out.print("[" + numeroBuscado + "]: ");
                numeroIntroducido = Integer.parseInt(teclado.nextLine());
                if (numeroBuscado == numeroIntroducido) {
                    encontrado = true;
                } else if (numeroBuscado > numeroIntroducido) {
                    out.println("Mi número es mayor.");
                } else {
                    out.println("Mi número es menor.");
                }

            } catch (NumberFormatException e) {
                out.println("No es un número.");
            }
        } while (intentos < 10 && !encontrado);
        if (encontrado) {
            out.println("Bieeen!!! Acertaste.");
        } else {
            out.println("Upsss! Se acabaron los intentos, el número era el " + numeroBuscado);
        }
    }

    public void juegoConClase() {
        try {
            Juego<String> juego = new com.example.juegos.numero.JuegoDelNumero();
            juego.inicializar();
            ((com.example.juegos.numero.JuegoDelNumero) juego).addNotificaListener(arg -> {
                out.println("NOTIFICA: " + arg.getMsg());
                out.println("¿Qieres cancelar?:");
                arg.setCancel("s".equals(teclado.nextLine()));
            });
            for (int intentos = 1; intentos <= 10; intentos++) {
                out.print("Dame tu número del 1 al 100 (" + (juego.getJugada() + 1) + " de 10): ");
                try {
                    juego.jugada(teclado.nextLine());
//                    out.println(juego.getResultado());
                    if (juego.getFinalizado()) {
                        break;
                    }
                } catch (JuegoException e) {
                    if (e.getCause() instanceof NumberFormatException) {
                        out.println(e.getMessage());
                    } else {
                        throw e;
                    }
                }
            }
        } catch (JuegoException e) {
            e.printStackTrace();
        }
    }

    public void decode(String expresion) {
        if (expresion == null || "".equals(expresion) || !Character.isDigit(expresion.charAt(0))) {
            throw new java.lang.IllegalArgumentException("No es una expresión valida");
        }
        String operando = "";
        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);
            if (Character.isDigit(ch)) {
                operando += ch;
            } else if (ch == ',') {
                if (operando.indexOf(ch) == -1) {
                    operando += ch;
                } else {
                    // throw new Exception("Ya existe separador decimal.");
                }
            } else if ("+-*/%=".indexOf(ch) >= 0) {
                if (operando.endsWith(",")) {
                    operando += "0";
                }
                System.out.println(operando + " " + ch);
                if (ch == '=') {
                    break;
                }
                operando = "";
            } else if (ch != ' ') {
//				throw new Exception("Carácter no valido.");
            }
        }
    }

    public double calcula(String expresion) throws CalculadoraException, Exception {
        if (expresion == null || "".equals(expresion) || !Character.isDigit(expresion.charAt(0))) {
            throw new java.lang.IllegalArgumentException("No es una expresión valida");
        }
        String operando = "";
        Calculadora calculadora = new Calculadora();
        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);
            if (Character.isDigit(ch)) {
                operando += ch;
            } else if (ch == ',') {
                if (operando.indexOf(ch) == -1) {
                    operando += ch;
                } else {
                    // throw new Exception("Ya existe separador decimal.");
                }
            } else if ("+-*/%=".indexOf(ch) >= 0) {
                if (operando.endsWith(",")) {
                    operando += "0";
                }
                calculadora.calcula(operando, ch);
                System.out.println(operando + "\t" + ch + "\t" + calculadora.getAcumulado());
                if (ch == '=') {
                    break;
                }
                operando = "";
            } else if (ch != ' ') {
//				throw new Exception("Carácter no valido.");
            }
        }
        System.out.println(calculadora.getAcumulado());
        return calculadora.getAcumulado();
    }

    public List<Calculadora.Operacion> decodeToList(String expresion) {
        if (expresion == null || "".equals(expresion) || !Character.isDigit(expresion.charAt(0))) {
            throw new java.lang.IllegalArgumentException("No es una expresión valida");
        }
        List<Calculadora.Operacion> resulatado = new ArrayList<>();
        String operando = "";
        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);
            if (Character.isDigit(ch)) {
                operando += ch;
            } else if (ch == ',') {
                if (operando.indexOf(ch) == -1) {
                    operando += ch;
                } else {
                    // throw new Exception("Ya existe separador decimal.");
                }
            } else if ("+-*/%=".indexOf(ch) >= 0) {
                if (operando.endsWith(",")) {
                    operando += "0";
                }
                resulatado.add(new Calculadora.Operacion(operando, ch));
                if (ch == '=') {
                    break;
                }
                operando = "";
            } else if (ch != ' ') {
//				throw new Exception("Carácter no valido.");
            }
        }
        return resulatado;

    }

    public void calculaList(String expresion) throws CalculadoraException, Exception {
        try {
            var operaciones = decodeToList(expresion);
            for (Calculadora.Operacion operacion : operaciones) {
                System.out.println(operacion.getOperando() + " " + operacion.getOperador());
            }
            System.out.println((new Calculadora()).calcula(operaciones));
        } catch (CalculadoraException e) {
            e.printStackTrace();
        }
    }

    private void naipes() {
        var b = new BarajaFrancesa();

        try {
            System.out.println("Baraja\n-------------------------------");
            for (var c : b.getCartas()) {
                System.out.println(c);
            }
            System.out.println("\nMazo\n-------------------------------");
            b.barajar();
            b.getMazo().forEach(System.out::println);
            b.reparte(4, 5).forEach(item -> {
                System.out.println("\nJugador\n-------------------------------");
                item.forEach(System.out::println);
            });
            System.out.println("\nQuedan " + b.getMazo().size());
            var mano = b.reparte(1, 2);
            System.out.println("\nQuedan " + b.getMazo().size());
            b.reparte(4, 5).forEach(item -> {
                System.out.println("\nJugador\n-------------------------------");
                item.forEach(System.out::println);
            });
            System.out.println("\nQuedan " + b.getMazo().size());
            mano.forEach(item -> {
                System.out.println("\nJugador\n-------------------------------");
                item.forEach(System.out::println);
            });
            System.out.println("\nQuedan " + b.getMazo().size());
            b.apilar(mano.get(0));
            b.getMazo().forEach(System.out::println);
            // b.apilar(mano.get(0));
            // b.apilar(List.of(new NaipeFrances(NaipeFrances.Palos.CORAZONES, (byte)1)));
            System.out.println("\nQuedan " + b.getMazo().size());
            System.out.println(ValorNaipe.REINA.valorNumerico);
            System.out.println(ValorNaipe.toEnum(12));
        } catch (JuegoException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
