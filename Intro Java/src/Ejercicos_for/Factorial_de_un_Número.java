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
public class Factorial_de_un_Número {

    public static void main(String[] args) {
    
        int num = 5;
        int acumulador_fact = 1;
        for (int contador = num; contador >= 1; contador--) {
            acumulador_fact *= contador;

        }
        System.out.println(" Factorial = " + acumulador_fact);
    }

}
