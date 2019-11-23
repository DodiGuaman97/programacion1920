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
public class CajeroautomaticoWhile {
    public static void main(String[] args) {
       
        System.out.println("CAJERO AUTOMATICO - BANCO DE LOJA");
        System.out.println("dijita 1 para realizar un retiro");
        System.out.println("dijita 2 para realizar un deposito");
        System.out.println("dijita 3 para una consulta de saldo");
        System.out.println("dijita 0 si no quieres hacer nada");
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingresar el saldo incial de tu cuenta");
        int saldo_cuenta = teclado.nextInt();
        System.out.println("ingrese la opcion elegida");
        int opcion = teclado.nextInt();
    
        switch (opcion){
           
            case 1:
                System.out.println("oOPCION PARA REALIZAR UN RETIRO");
                System.out.println("ingrese el valor a retira");
                int retiro = teclado.nextInt();
                if(retiro<= saldo_cuenta){
                }else{
                    System.out.println("FONDOS INSUFICIENTES");
                    
                }
                break;
            case 2:
                System.out.println("OPCION PARA REALIZAR UN DEPOSITO");
                System.out.println("ingrese el valor a depositar");
                int deposito = teclado.nextInt();
                if(deposito<= 0){
                    saldo_cuenta = saldo_cuenta + deposito;
                }else{
                    System.out.println("HEY, estas intentando depositar un numero negativo");
      
                 }
                System.out.println("HAS AGRAGADO SALDO A TU CUENTA");
                System.out.println("");
            case 3:
                System.out.println("saldo de la cuenta");
                System.out.println("tu saldo es:S"+saldo_cuenta);
                break;
            case 0:
                System.out.println("a sido un gusto atenderlo");
                break;
                
            default:
                System.out.println("la opcion selecionada no existe");
        }
        System.out.println("su saldo es de : $"+ saldo_cuenta);
        
    }    
    }

