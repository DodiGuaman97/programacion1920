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
public class Tiempo {
   //Atributos de la clase, se declara de forma global
    public int hora;
   public int minuto;
    public int segundo;
    
    public Tiempo(){
        System.out.println("Se ha iniciado la clase Tiempo");
    }
    /**
     * Este metodo es el constructor de la clase.
     * es constructor se ejecuta 
     */
    public Tiempo(int hora, int minuto, int segundo){
        
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    /**
     * Metodo q emcapsula o envuelve al atributo hora y sirve para devolver 
     * el valor que tiene la variable hora
     * @return 
     */
    public int obtener_hora(){
        return hora;
        
    }
    /**
     * Metodo q emcapsula o envuelve al atributo hora y sirve para devolver 
     * el valor que tiene la variable minutos
     * @return 
     */
    public int obtener_minuto(){
        return minuto;
    }
    /**
     * Metodo q emcapsula o envuelve al atributo hora y sirve para devolver 
     * el valor que tiene la variable segundo
     * @return 
     */
    public int obtener_segundo(){
        
    return segundo;
    }

  /**
   * Metodo para devolver el tiempo
   * @return 
   */
    public int obtener_Tiempo_real(){
       
        String tiempo = hora +":" +minuto+":" +segundo;
        
        return hora;
        
    
    }   
    
}
