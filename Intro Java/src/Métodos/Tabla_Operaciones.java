/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Tabla_Operaciones {

    public static void main(String[] args) {
        Scanner teclado = new java.util.Scanner(System.in);

        System.out.println("Que operacion desea realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");

        int caso = teclado.nextInt();
        System.out.println("Ingresar uun numero del 1  al 10");
        int num = teclado.nextInt();
        switch (caso) {
            case 1: //suma
                System.out.println(suma(num));
                break;
            case 2://resta
                System.out.println(resta(num));
                break;
            case 3://multi
                System.out.println(mult(num));
                break;
            case 4://div
                System.out.println(div(num));
                break;
        }
    }

    /**
     * Metodo con retorno que realiza las tablas de sumar
     *
     * @param num ingresar numero del 1 al 10 para realizar la suma por las
     * tablas del 1 al 12
     * @return
     */
    public static int suma(int num) {
        int suma = 0;
        for (int i = 0; i <= 12; i++) {
            suma = num + i;
            System.out.println(+num + " + " + i + " = " + suma);
        }
        return suma;
    }

    /**
     * Metodo con retorno que realiza las tablas de restar
     *
     * @param num ingresar numero del 1 al 10 para realizar la resta por las
     * tablas del 1 al 12
     * @return
     */
    public static int resta(int num) {
        int resta = 0;
        for (int i = 0; i <= 12; i++) {
            resta = num - i;
            System.out.println(+num + " - " + i + " = " + resta);
        }
        return resta;
    }

    /**
     * Metodo con retorno que realiza las tablas de multiplicar
     *
     * @param num ingresar numero del 1 al 10 para realizar la multuiplicacion
     * por las tablas del 1 al 12
     * @return
     */
    public static int mult(int num) {
        int mult = 0;
        for (int i = 0; i <= 12; i++) {
            mult = num * i;
            System.out.println(+num + " * " + i + " = " + mult);
        }
        return mult;
    }

    /**
     * Metodo con retorno que realiza las tablas de dividir
     *
     * @param num ingresar numero del 1 al 10 para realizar la division por las
     * tablas del 1 al 12
     * @return
     */
    public static double div(double num) {
        double div = 0;
        for (double i = 1; i <= 12; i++) {
            div = num / i;
            System.out.println(+num + " / " + i + " = " + div);
        }
        return div;
    }
}
