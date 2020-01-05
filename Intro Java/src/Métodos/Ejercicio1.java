/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrse el número a verificar");
        int num = teclado.nextInt();
        //determinar_si_es_par(num);
        String msg = determinar_si_es_par_v2(num);//recibimos el valor que retornara el metodo
        System.out.println(msg);
    }

    /**
     * Es un metodo que si retorna un valor. Este metodo sirve para determonar
     * si un numero es par o no.
     *
     * @param numero
     * @return
     */
    public static String determinar_si_es_par_v2(int numero) {
        String mensaje = " ";
        if (numero % 2 == 0) {
            mensaje = " Es par";
        } else {
            mensaje = " No es par ";
        }
        return mensaje;

    }

    /**
     * Es un metodo que no retorna ningun valor. Este método sirve para
     * detreminar si un número es par o no.
     *
     * @param numero Es el valor que se evalúa para determinar si es par o no.
     */
    public static void determinar_si_es_par(int numero) {

        if (numero % 2 == 0) {
            System.out.println(" Es par ");
        } else {
            System.out.println(" No es par ");
        }
    }
}
    