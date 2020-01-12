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
public class Funciones {
    public static void main(String[] args) {
        
     Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el número para realizar la operación:");

        int num = teclado.nextInt();

        System.out.println("Que opcion desea realizar");
        System.out.println("1. Tangente");
        System.out.println("2. Cotangente");
        System.out.println("3. Secante");
        System.out.println("4. Cosecante");

        int casos = teclado.nextInt();

        switch (casos) {
            case 1:
                double an_tan = Funciones.determinar_tan(num);
                System.out.println("");
                System.out.println(an_tan);

                break;

            case 2:
                double an_cotan = Funciones.determinar_cotan(num);

                break;

            case 3:
                double an_sec = Funciones.determinar_sec(num);

                break;
            case 4:
                double an_cosc = Funciones.determinar_cosc(num);

                break;
        }

    }
/**
 * Metodo con retorno par determinar la tangente de un numero 
 * @param num ingresar numero a operar
 * @return 
 */
    public static double determinar_tan(double num) {
        double tan = 0;
        tan = Math.sin(num) / Math.cos(num);
        return tan;

    }
/**
 * Metodo con retorno par determinar la cotangente de un numero 
 * @param num ingresar numero a operar
 * @return 
 */
    public static double determinar_cotan(double num) {
        double cotan = 0;
        cotan = Math.cos(num) / Math.sin(num);
        return cotan;
    }
/**
 * Metodo con retorno par determinar la secante de un numero 
 * @param num ingresar numero a operar
 * @return 
 */
    public static double determinar_sec(double num) {
        double sec = 0;
        sec = 1 / Math.cos(num);
        return sec;
    }
/**
 * Metodo con retorno par determinar la cosecante de un numero 
 * @param num ingresar numero a operar
 * @return 
 */

    public static double determinar_cosc(double num) {
        double cosc = 0;
        cosc = 1 / Math.sin(num);
        return cosc;
    }

}
