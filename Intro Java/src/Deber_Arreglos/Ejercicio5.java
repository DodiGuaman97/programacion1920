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
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] n = new int[15];
        int num = 0;
        int op = teclado.nextInt();
        int sitio = 0;
        int j = 0;

        for (int i = 0; i < n.length - 1; i++) {
            System.out.println("ingrese numeros");
            n[i] = teclado.nextInt();

        }

        System.out.println("porfavor presione 1 para afirmar que desea introducir un nuevo numero");
        op = teclado.nextInt();
        if (op == 1) {
            System.out.println("ingrese un numero a insertar");
            num = teclado.nextInt();

        } else {
            if (op != 0) {

            }

        }
        while (n[j] < num && j < 5) {
            sitio++;
            j++;

        }
        System.out.println("el anterior arreglo arreglo");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);

        }

        for (int i = 13; i >= sitio; i--) {
            n[i + 1] = n[i];

        }
        n[sitio] = num;
        System.out.println("el nuevo arreglo queda :");
        for (int i = 0; i < 15; i++) {
            System.out.println(n[i]);

        }

    }
}

