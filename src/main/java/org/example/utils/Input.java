package org.example.utils;

import java.util.Locale;
import java.util.Scanner;
import org.example.models.Consolas;

public class Input {
    /**
     * Clase que permite leer una entrada por teclado.
     */
    Scanner sc = new Scanner(System.in);

    /**
     * Lee una linea entrada por teclado. Devuelve el String
     *
     * @return La entrada.
     */
    public String readLine() {
        String line = "";
        System.out.println("Dime un Título:");
        do {
            line = sc.nextLine();
        } while (line.length() == 0);
        return line;
    }
    /**
     * Lee un entero entrada por teclado.
     *
     * @return El entero.
     */
    public int readInt() {
        int i = 0;
        boolean ok = false;
        do {
            try {
                i = sc.nextInt();
                ok = true;
            } catch (Exception e) {
                System.err.println("Error: no es un entero.");
                sc.next();
            }
        } while (!ok);
        return i;
    }
    /**
     * Lee un float entrada por teclado.
     *
     * @return El float.
     */
    public float readFloat() {
        float f = 0;
        boolean ok = false;
        do {
            try {
                System.out.println("Dame un Precio:");
                f = sc.nextFloat();
                ok = true;
            } catch (Exception e) {
                System.err.println("Error: No es un precio Válido.");
                sc.next();
            }
        } while (!ok);
        return f;
    }
    /**
     * Lee un double entrada por teclado.
     *
     * @return El double.
     */
    public double readDouble() {
        double d = 0;
        boolean ok = false;
        do {
            try {
                d = sc.nextDouble();
                ok = true;
            } catch (Exception e) {
                System.err.println("Error: no es un double.");
                sc.next();
            }
        } while (!ok);
        return d;
    }

    /**
     * Lee un boolean por teclado
     */
    public boolean readBoolean() {
        boolean b = false;
        boolean ok = false;
        do {
            try {
                b = sc.nextBoolean();
                ok = true;
            } catch (Exception e) {
                System.err.println("Error: no es un boolean.");
                sc.next();
            }
        } while (!ok);
        return b;
    }
    public static Consolas TypeConsoles(){
        System.out.println("Dime la Plataforma para el Juego:");
        Scanner sc = new Scanner(System.in);
        String answer;
        boolean isOk = false;
        Consolas consoles = null;

        do {
            answer = sc.nextLine();

            try {
                consoles = Consolas.valueOf(answer.toUpperCase(Locale.ROOT).trim());
                isOk = true;
            } catch (Exception e) {
                sc.nextLine();
            }
        }while(!isOk);
        return consoles;
    }
}



