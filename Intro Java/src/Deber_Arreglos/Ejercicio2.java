/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_Arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[30];
        int may;
        int men;

        for (int indice = 0; indice < num.length; indice++) {
            System.out.println("Ingresar la cantidad de venta");
            num[indice] = teclado.nextInt();

        }

        may = men = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > may) {
                may = num[i];
            }
            if (num[i] < men) {
                men = num[i];

            }
        }
        System.out.println("la mayor venta que se realizo fue de: " + may);
        System.out.println("La menor venta que se realizo fue de: " + men);
    }
}

