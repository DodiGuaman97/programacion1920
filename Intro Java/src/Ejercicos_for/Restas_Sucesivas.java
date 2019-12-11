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
public class Restas_Sucesivas {

    public static void main(String[] args) {

        int dividendo = 7;
        int divisor = 2;
        int cont;
        for (cont = 0; dividendo >= divisor; cont++) {
            dividendo = dividendo - divisor;
        }
        System.out.println("El resultado de la divición es  " + cont);
    }

}
