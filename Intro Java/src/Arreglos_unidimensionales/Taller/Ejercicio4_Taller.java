/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_unidimensionales.Taller;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4_Taller {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];
        int c[] = new int[5];

        for (int i = 0; i < a.length; i++) {
            System.out.println("ingresar numero para el primer arreglo");
            a[i] = teclado.nextInt();

            System.out.println("ingresar numero para el segundo arreglo");
            b[i] = teclado.nextInt();
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] + b[i];

        }
        System.out.println("*****");

        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);

        }

    }

}
