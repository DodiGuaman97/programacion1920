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
public class Piramide_Numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String acum = "";

        System.out.print("Ingresa el limite para generar ");
        int n = teclado.nextInt();

        for (int cont = 1; cont <= n; cont++) {
            
            acum = acum + cont;

            System.out.println(acum);

        }
    }
}
