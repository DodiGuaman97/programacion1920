/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P.O.O;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejecuta_Cajero {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el saldo inicial de la cuenta: ");
        int saldo_inicial = teclado.nextInt();
        teclado.nextLine();

        // cramos una instacia de la clase cajero automatico
        Cajero_Automatico cajero = new Cajero_Automatico(saldo_inicial);
        int opcion = 0;
        while (opcion != 4) {

            System.out.println("CAJERO AUTOMATICO UTPL");
            System.out.println("Dijite 1 para Retirar");
            System.out.println("Dijite 2 para Depositar");
            System.out.println("Dijite 3 para consultar saldo");
            System.out.println("Dijite 4 para Salir");
            System.out.println("-------------------------------");

            teclado.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor a retirar");
                    int valor_retiro = teclado.nextInt();
                    teclado.nextLine();
                    cajero.retirar(valor_retiro);
                    System.out.println("Saldo contable: " + cajero.consultar_saldo());
                    break;
                case 2:
                    System.out.println("Ingrese el valor a depositar3");
                    int valor_deposito = teclado.nextInt();
                    teclado.nextLine();
                    cajero.depositar(valor_deposito);
                    break;
                case 3:
                    System.out.println("Saldo de la cuenta :" + cajero.consultar_saldo());
                    break;
                case 4:
                    System.out.println("Gracias por preferirnos.!");
                    break;

            }
            System.out.println("¿Cual es el saldo inicial de mi cuenta: " + "$" + cajero.consultar_saldo());

        }
        System.out.println("Ingrese un valor a depositar: ");
        int valor_deposito = teclado.nextInt();
        teclado.nextLine();
        cajero.depositar(valor_deposito);
        System.out.println("Ingrese el valor a retirar");
        int valor_retiro = teclado.nextInt();
        teclado.nextLine();
        cajero.retirar(valor_retiro);

    }
}
