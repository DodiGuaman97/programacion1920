/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Prueba;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio_while {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, suma;
        System.out.println("Dijete las 3 calificaciones");
        nota1 = teclado.nextFloat();
        nota2 = teclado.nextFloat();
        nota3 = teclado.nextFloat();
        suma = nota1 + nota2 + nota3;
        System.out.println("\nla suma es :" + suma);

    }


}
