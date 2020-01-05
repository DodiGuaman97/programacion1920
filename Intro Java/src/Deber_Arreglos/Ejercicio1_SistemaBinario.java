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
public class Ejercicio1_SistemaBinario {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int v = 0;
        int cont = 0;
        int binario[] = new int[6];
        for (int i = 0; i < binario.length; i++) {
            System.out.println("Ingresar datos del numero binario");
            binario[i] = teclado.nextInt();
        }

        for (int i = binario.length - 1; i >= 0; i--) {
            if (binario[i] == 1) {
                v += (int) Math.pow((double) 2, (double) cont);
            }
            cont++;
        }
        System.out.println("-----");
        System.out.println("el numero binario en decimal es: " + v);
    }
}
