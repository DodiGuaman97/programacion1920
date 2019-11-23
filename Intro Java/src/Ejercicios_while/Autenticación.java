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
public class Autenticación {
     public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
      String usuario = "Dodi Guaman";
      String password = "1997";
      boolean autenticacion = false;
  while(!autenticacion){
         System.out.println("IAUTENTIQUESE CON SU USUARIO Y CONTRASEÑA");
         String us = teclado.next();
         String pass = teclado.next();
         if (usuario.equals(us)&& pass.equals(pass)){
             System.out.println("BIENBVENIDO AL SISTEMA");
             autenticacion = true;
         }else {
             System.out.println("auntenticacion incorrecta !");
         }
         
     
     }
     }
}
