/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Prueba;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Proyecto {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int x, a, b;

        System.out.println("Ingrsa el valor de A: ");
        a = teclado.nextInt();
        System.out.println("Ingresa el valor de b: ");
        b = teclado.nextInt();
        if (a != 0) {
            x = -b / a;
            System.out.println("Solucion imposible");

        } else if (b != 0) {
            System.out.println("Solucion imposible");

        } else {
            System.out.println("Solucion indeterminada");

        }
    }
}
