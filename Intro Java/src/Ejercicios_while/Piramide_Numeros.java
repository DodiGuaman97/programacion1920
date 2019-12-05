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
public class Piramide_Numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("DIJITE EL NUMERO DE INICIO");
        int inicio = teclado.nextInt();

        System.out.print("DIGITE EL NUMERO DE FILAS ");
        int filas = teclado.nextInt();
        
        int contadornivel = 0;
        int contador = 1;
        int limA = 1;

        while (contadornivel < filas) {
            while (contador <= limA) {
                System.out.print(inicio + " ");
                contador++;
                inicio++;
            }
            limA++;
            contador = 1;
            System.out.print("\n");
            contadornivel++;

        }
    }
}
