/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_unidimensionales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ficha_Datos {

    public static void main(String[] args) {
        String nombre[] = new String[3];
        int edad[] = new int[3];
        String universidad[] = new String[3];
        String celular[] = new String[3];

        Scanner teclado = new Scanner(System.in);
        for (int indice = 0; indice < edad.length; indice++) {
            System.out.println("Ingrese el nombre del estudiante");
            nombre[indice] = teclado.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            universidad[indice] = teclado.nextLine();
            System.out.println("Ingrese la universidad del estudiante");
            celular[indice] = teclado.nextLine();
            System.out.println("Ingrese la edad el estudiate");
            edad[indice] = (int) teclado.nextInt();
            teclado.nextLine();

        }
        //operacion de lectura
        int acumulador_edad = 0;
        for (int indice = 0; indice < edad.length; indice++) {
            acumulador_edad = acumulador_edad + edad[indice];//sumamos edades
            System.out.println(edad[indice]);
            System.out.println("Nombre:" + nombre[indice]);

            System.out.println("Universidad:" + universidad[indice]);
            System.out.println("celular:" + celular[indice]);
            System.out.println("//");
        }
        System.out.println("Promedio de edades:" + acumulador_edad / edad.length);
    }

}
