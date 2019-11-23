/*
 * Programa para realizar la multiplicacion de N numeros ingresados porteclado
 */
package Ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Multiplicacio_N {
   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean nuevo_numero= false;
        int acumulador = 1;
        do{
            System.out.println("Desea ingresar otro numero si/no");
            String respuesta = teclado.next();
            respuesta = respuesta.toLowerCase();
            if(respuesta .equals("si")){
                System.out.println("ingrese el numero");
                int numero = teclado.nextInt(); 
                acumulador = acumulador * numero;
            }else if (respuesta .equals ("no"));{
            nuevo_numero = true; //hacemos que finalice el ciclo de repeticion
            
         }
    }while (nuevo_numero == true);
    System.out.println("la multiplicacion de los numeros es : "+ acumulador );
    
}
}