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
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num[] = new int[25];
        int aux = 0;
        int cero = 0;
        int mayor = 0;
        int menor = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("ingrese el numero");
            num[i] = teclado.nextInt();

        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 0) {
                cero = cero + 1;

            } else {
                if (num[i] > 0) {
                    mayor = mayor + 1;

                } else {
                    if (num[i] < 0) {
                        menor = menor + 1;

                    }
                }
            }

        }
        System.out.println("los numeros igual a cero son: " + cero);
        System.out.println("los numeros menores a cero son: " + menor);
        System.out.println("los numeros mayores acero son: " + mayor);

    }

}
