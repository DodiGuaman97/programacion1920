/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fracciones {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar limite de la serie");
        int n = teclado.nextInt();

        int contador = 1;
        int numerador = 0;
        int denominador = 1;
        double fracccion = 0;

        while (contador <= n) {
            numerador = 1;
            denominador = denominador + 1;
            contador = contador + 1;
            System.out.print(numerador + "/" + denominador);
        }

    }
}
