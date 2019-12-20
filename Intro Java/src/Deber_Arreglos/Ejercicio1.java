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
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String a[] = new String[4];
        int user = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingresar nombre nr: " + i);
            a[i] = teclado.nextLine();

        }
        System.out.println("Ingresar numero de lista");
        user = teclado.nextInt();
        System.out.println("el nombre de la lista es: " + a[user]);

    }

}
