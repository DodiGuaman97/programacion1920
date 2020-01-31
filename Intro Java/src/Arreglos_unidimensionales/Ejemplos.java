 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arreglos_unidimensionales;

/**  
 *
 * @author Usuario
 */
public class Ejemplos {
    public static void main(String[] args) {
        //1.declaracion de arreglos con valores iniciales 
        String universidades[] = {"Utpl","Unl","Ucuenca"};
        
        System.out.println(universidades [1]);
        //2.declaracion de arreglo, indicandon su longuitud
        String estudiantes[]=new String[20];
        estudiantes[0] = " Inicio ";
        estudiantes[7] = " Dodi Guaman ";
        estudiantes[19] = " Final ";
        estudiantes[0] = " Nuevo Valor ";
        
        for (int indice = 0; indice < estudiantes.length; indice++) {
            System.out.println("estudiantes["+ indice +"]="+estudiantes[indice]);        
        }
       // System.out.println(universidades[0]);
       //System.out.println(universidades[1]);
       // System.out.println(universidades[2]);
        for(int indice=0;indice< universidades.length;indice++){
            System.out.println(universidades[indice]);
        }
    }
    
}
