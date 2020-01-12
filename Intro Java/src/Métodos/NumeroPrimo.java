/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Métodos;

/**
 *
 * @author Usuario
 */
public class NumeroPrimo {

    /**
     * Método para verificar si un numero dado es primo o no
     *
     * @param numero
     * @return
     */
    public static boolean verificar_primo(int numero) {
        int cont_divisores = 0;
        for (int indice = 1; indice <= numero; indice++) {
            if (numero % indice == 0) {
                cont_divisores++;
            }
        }
        boolean resultado = false;
        if (cont_divisores == 2) {
            resultado = true;
        }
        return resultado;
    }
    /**
     * Método q permite contabilizar cuantos numeros primos existen hasta el limete indicado
     * @param limite Valor máximo para evaluar y contabilizar números primos
     */
    public static void contabilizar_numeros_primos (int limite){
        int cont_primos = 0;
        for (int indice = 1; indice <= limite; indice++) {
            if (verificar_primo(indice)== true){
            cont_primos++;// contabilizamos q hemos encontrado un nuevo numero primo
            
        }
            
            
        }
    
        System.out.println("Se an encontrado: " +cont_primos+ " Numeros Primos hasta el "+limite);
    }
    public static void main(String[] args) {
        // ¿cuantos numeros primos existen hasta el 10000?
        contabilizar_numeros_primos(10000);
    }
}
