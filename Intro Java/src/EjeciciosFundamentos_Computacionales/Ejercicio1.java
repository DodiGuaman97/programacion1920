/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjeciciosFundamentos_Computacionales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = teclado.nextInt();

        for (num1 = 0; num1 < num2; num1++) {
            for (num2 = 0; num2 < num3; num2++) {
                for (num3 = 0; num3 < num1; num3++) {

                }
                System.out.println("El mayor es " + num1);
            }
            System.out.println("El mayor es " + num2);
        }
        System.out.println("El mayor es  " + num3);
    }
}
