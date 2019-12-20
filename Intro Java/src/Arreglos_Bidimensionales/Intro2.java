/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Bidimensionales;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Intro2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CREAR Y ESCRIBIR UNA MATRIZ");
        System.out.println("Ingrese el numero de filas de la matriz");
        int filas = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el numero de columnasde la matriz");
        int cols = teclado.nextInt();
        teclado.nextLine();
        //Creación de una matriz vacia
        String nombres[][] = new String[filas][cols];//dimención 2x5
        System.out.println("Escritura de los elementos de la matriz");
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols = nombres[fila].length;

            for (int col = 0; col < tam_cols; col++) {//recorre columnas
                System.out.println("Ingrese un valor");
                String valor = teclado.nextLine();
                nombres[fila][col] = valor;
               
            }
        }
        System.out.println("Lectura de los elementos de la matriz");
        //Vamos a rrecorrer la matriz, filas y columnas.
        for (int fila = 0; fila < nombres.length; fila++) {
            int tam_cols = nombres[fila].length;

            for (int col = 0; col < tam_cols; col++) {//recorre columnas
                System.out.print(nombres[fila][col] + "\t");
            }
            System.out.println("");
        }
    }

}
