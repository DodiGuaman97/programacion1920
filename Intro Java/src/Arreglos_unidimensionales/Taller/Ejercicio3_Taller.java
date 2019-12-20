/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_unidimensionales.Taller;

/**
 *
 * @author Usuario
 */
public class Ejercicio3_Taller {

    public static void main(String[] args) {

        int a[] = new int[20];
        int cont = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = cont + 2;
            cont++;
            cont++;

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

}
