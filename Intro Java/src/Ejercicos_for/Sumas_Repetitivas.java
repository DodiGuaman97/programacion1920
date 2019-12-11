/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicos_for;

/**
 *
 * @author Usuario
 */
public class Sumas_Repetitivas {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 3;
        int acumulador = 0;
        for (int cnt = 1; cnt <= num2; cnt++) {
            acumulador = acumulador + num1;

        }
        System.out.println("La Suma es: " + acumulador);

    }

}
