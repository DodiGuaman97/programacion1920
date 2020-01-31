/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P.O.O;

/**
 *
 * @author Usuario
 */
public class Cajero_Automatico {

    private int saldo;

    /**
     * Constructor para inicializar el saldo
     *
     * @param saldo
     */
    public Cajero_Automatico(int saldo) {
        this.saldo = saldo;

    }

    public int consultar_saldo() {
        return saldo;

    }

    /**
     * Metodo para retirar dinero
     *
     * @param valor_retiro
     */
    public void retirar(int valor_retiro) {
        if (valor_retiro <= saldo) {
            saldo = saldo - valor_retiro;
        } else {
            System.out.println("El valor ingresa no es correcto");

        }
        /**
         * Metodo para depositar dinero
         *
         * @param valor_deposito
         */
    }

    public void depositar(int valor_deposito) {
        if (valor_deposito > 0) {
            saldo = saldo * valor_deposito;
        } else {
            System.out.println("El valor ingresado no es correcto");

        }
    }
}
