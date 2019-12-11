/*

//ESTE PROGRAMA SIRVA PARA SACAR EL PROMEDIO
  */
package Ejercicios_Proyecto;
 import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Promedio_de_Numeros {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
   
        int contador = 0;
        double acumulador = 0;
        double total = 0;
        boolean n = true;
        
        while(n == true){
            
            System.out.println("DESEA INGRESAR UN NUMERO si/no");
            String respuesta = teclado.next();
            respuesta = respuesta.toLowerCase();           
            if (respuesta.equals("si")) {
                System.out.println("INGRSE UN NUMERO");
                int numero = teclado.nextInt();
                acumulador = acumulador + numero;
                contador=contador+1;              
            }else if (respuesta.equals("no") ) {
                n = false; 
            }
            total = acumulador / contador;
        }
        System.out.println("EL PROMEDIO DE LOS NUMEROS ES: "+total);
    }
}

