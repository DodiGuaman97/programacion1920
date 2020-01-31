/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_Bidimensionales;

/**
 *
 * @author Usuario
 */
public class Intro {

    public static void main(String[] args) {
        //Decalración de matriz con valores conocidos de 2x5
        String nombres[][] = {{"Alexander", "Isaias", "Dodi", "Mario", "luis"},
        {"Genesis", "Diego", "Ramiro", "Antoni", "Ariel"}};
        //System.out.println(nombres[0][2]);
        // System.out.println(nombres[1][4]);
        System.out.println("fila:" + nombres.length);//devuelve el numero de filas
        //Vamos a recorrer la matriz con la ayuda de 2 indices 
        for (int fila = 0; fila < 5; fila++) {//recorremos las filas
            //int tam_cols= nombres[fila].length; // obtenemos el # de columnas de la fila
            for (int col = 0; col < 2; col++) {//recorremos columnas
                System.out.print(nombres[col][fila] + "\t");
            }
            System.out.println("");
        }

    }

}
