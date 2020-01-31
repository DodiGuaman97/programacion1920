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
public class AmbitoVariables {
    //creacion de variables globales 
    int sueldo_basico = 400;
    double aporte_iess = 0.09;
   
    /**
     * Calcula el aporte al iess de un trabajador 
     * @return aporte 
     */
    public  double calcular_aporte_iess(){
        double aporte = sueldo_basico * aporte_iess;
        return aporte;
    }
    /**
     * Metodo para calcular el valor liquido de un deposito
     * @return 
     */
    public double valor_a_depositar(){
        double valor_liquido = sueldo_basico - calcular_aporte_iess();
        return valor_liquido;
    }
    public static void main(String[] args) {
        AmbitoVariables objeto = new AmbitoVariables();
        double calculo = objeto.calcular_aporte_iess();
        System.out.println("Sueldo basico:" + objeto.sueldo_basico);
        System.out.println(" El aporte al IESS es: " +calculo);  
        double valor_deposito = objeto.valor_a_depositar();
        System.out.println("Valor a depositar al trabajador: " + valor_deposito);
        
    }
}
