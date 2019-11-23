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
public class MultiplicacionConSumas {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int contador = 1;
    int acumulador = 0;
        System.out.println("ingrese un numero");
        int n1 = sc.nextInt();
        System.out.println("ingrese un numero");
        int n2 = sc.nextInt();
        while(contador<-n2){
            acumulador = acumulador+n1;
            contador=contador+1;
            
        }
        System.out.println("la respuesta es :"+acumulador);
    
    }
    
}
