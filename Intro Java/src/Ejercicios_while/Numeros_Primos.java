/*
 *  Programa para implementar olgoritmo que genera numeris primos 
 */
package Ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Numeros_Primos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingres eun numero para verificxar si es primo o no");
        int contador_numeros = 2;
        int contador_primos = 0;
        while (contador_primos < 10) {
            int num = contador_numeros;
            int contador = num;
            int acumulador = 0;
            while (contador >= 1) {

                if (num % contador == 0) {
                    acumulador++; //solo sirve para incrementar en uno 
                }
                contador--;// decrementa en cadad ciclo el valor de contador en uno 

            }
            if (acumulador == 2) {
                
    
                contador_primos++;
            }
            contador_numeros++;//incrementamos en uno
            
        }
    }
}