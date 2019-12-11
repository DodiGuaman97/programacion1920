/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicos_for;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Puente_2D {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduca la distacia");
        int d = teclado.nextInt();
        System.out.print("Introduce el número de columnas ");
        int c = teclado.nextInt();
        System.out.print("Ingrese el espacio");
        int e = teclado.nextInt();
        String acumulador = "";
        for (int i = 0; i < d; i++) {
            System.out.println("-");
        }
        acumulador = acumulador + "\n";
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < e; k++) {
                    acumulador = acumulador + " ";
                }
                acumulador = acumulador + " * ";
                i = i + 1;
            }
            acumulador = acumulador + "\n";
        }
        System.out.println("            PUENTE 2D");
        System.out.printf(acumulador);
    }
}
