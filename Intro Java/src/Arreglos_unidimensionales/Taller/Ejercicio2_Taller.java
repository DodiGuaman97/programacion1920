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
public class Ejercicio2_Taller {

    public static void main(String[] args) {

        String[] arreglo1 = {"a", "b", "c", "d", "e", "f"};
        String[] arreglo2 = {"g", "h", "i", "j", "k"};
        String[] salida = new String[arreglo1.length + arreglo2.length];
        int aux = 0;
  
        for (int i = 0; i < salida.length; i++) {
            if (i < arreglo1.length) {
                salida[i] = arreglo1[i];
            } else {
                salida[i] = arreglo2[aux];
                aux++;
            }
        }
      
        for (int i = 0; i < salida.length; i++) {
            System.out.print(salida[i] + ", ");
        }
    }

}
