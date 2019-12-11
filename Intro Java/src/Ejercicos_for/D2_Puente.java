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
public class D2_Puente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la distancia del puente");
        int distancia = teclado.nextInt();
        System.out.println("Ingrese la altura de las columnas");
        int columnas = teclado.nextInt();
        System.out.println("Ingrese distancia entre columnas");
        int espacios = teclado.nextInt();

        for (int cont = 0; cont <= distancia; cont++) {
            System.out.print("- ");
        }
        System.out.println("");

        for (int filas = 0; filas < columnas; filas++) {
            for (int col = 1; col <= distancia; col++) {
                if (col%(espacios+1)==0) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println("");
        }

    }
}
