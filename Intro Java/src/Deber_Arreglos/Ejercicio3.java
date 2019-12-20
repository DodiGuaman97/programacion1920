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
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero[] = new int[30];
        int i;

        for (int indice = 0; indice < numero.length; indice++) {
            System.out.println("Ingrese el numero");
            numero[indice] = teclado.nextInt();
        }
        int may = 0;
        int men = 0;
        int rep1 = 0;
        int rep2 = 0;

        may = men = numero[0];;

        for (int indice = 0; indice < numero.length; indice++) {
            if (numero[indice] == may) {
                rep1++;

            }
            if (numero[indice] == men) {
                rep2++;
            }

            if (numero[indice] > may) {

                may = numero[indice];

            }
            if (numero[indice] < men) {

                men = numero[indice];

            }

        }
        System.out.println("El numero mayor es: " + may);
        System.out.println("El numero menor es: " + men);
        System.out.println("numero mayor se repite: " + rep1);
        System.out.println("numero menor se repite: " + rep2);

    }
}
