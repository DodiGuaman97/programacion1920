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
public class EjecutaTiempo {
    public static void main(String[] args) {
        // Vamos a llamar o instanciar a la clase Tiempo, para ello creamos un objeto
        Tiempo tiempo = new Tiempo(20,17,30);
        System.out.println("valor de hora:" + tiempo.obtener_hora());
        System.out.println("valor del minuto:" + tiempo.obtener_minuto());
        System.out.println("valor del segundo:"+ tiempo.obtener_segundo());
        System.out.println("Tiempo: "+ tiempo.obtener_Tiempo_real());
        
        //Vamos a crar un segundo objeto de la clase Tiempo
        Tiempo tiempo2 = new Tiempo(20,51,30);
        System.out.println("valor de hora:" + tiempo2.obtener_Tiempo_real());
    }
    
}
