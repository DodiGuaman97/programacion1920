/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_Prueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *Este metodo nos sive para realizar ecuaciones de primer grado.
 * @author Usuario
 */
public class Prueba_Proyecto {

    public static void main(String[] args)throws IOException  {

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        float y, x;

        System.out.println("Introduzca A: ");
        String A = teclado.readLine();
        float a = Float.parseFloat(A);

        System.out.println("Introduzca B: ");
        String B = teclado.readLine();
        float b = Float.parseFloat(B);

        System.out.println("Introduzca C: ");
        String C = teclado.readLine();
        float c = Float.parseFloat(C);

        System.out.println("Introduzca D: ");
        String D = teclado.readLine();
        float d = Float.parseFloat(D);

        System.out.println("Introduzca E: ");
        String E = teclado.readLine();
        float e = Float.parseFloat(E);

        System.out.println("Introduzca F: ");
        String F = teclado.readLine();
        float f = Float.parseFloat(F);

        y = ((f * a) - (d * c)) / ((e * a) - (d * b));
        x = (c - (b * y)) / a;

        System.out.println("El valor de X = " + x);
        System.out.println("El valor de Y = " + y);

    }
}
