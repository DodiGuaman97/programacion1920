/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_while;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Trianguloasterisco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        int contador = 1;
        String asterisco = "";
        while(contador <= numero){
           asterisco = asterisco + "*";
           System.out.println(asterisco);
           contador++;
       
        
        
                }
        
        
        
    }
    
}
