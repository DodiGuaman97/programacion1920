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
public class ResolucionEjercicio {

    /**
     * Metodo para verificar si un numero dado es para o no
     *
     * @param numero
     * @return
     */
    public static boolean detectar_par(int numero) {
        boolean resultado = false;
        if (numero % 2 == 0) {
            resultado = true;
        }
        return resultado;
        

    }
    public static void main(String[] args) {
        //creamos arreglos con valore predeterminados
        int numeros[] = {2, 3, 5, 2, 4, 5, 6, 2, 1, 2};
        //creamos segundo arreglo con igual tamaño que el arreglo números
        int cuadrados[] = new int[numeros.length];
        // arreglo para almacenar el proceso de la operacion
        String procesos[] = new String[numeros.length];

        //cramos un ciclo de repeticion para recorrer arreglo
        for (int indice = 0; indice < numeros.length; indice++) {
            int cuadrado = numeros[indice] * numeros[indice];
            // almavenamos proceso de la operacion en el arreglo procesos
            procesos[indice] = numeros[indice] + "x" + numeros[indice];
            //almacenamos resultado en el arreglo cuadrados
            cuadrados[indice] = cuadrado;
        }
        //coclo de repeticion para los 3 arreglos
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.print(numeros[indice] + ", ");
        }
        System.out.println("\n---------------------------------");
        for (int indice = 0; indice < procesos.length; indice++) {
            System.out.print(procesos[indice] + ", ");
        }
        System.out.println("\n--------------------------------------------------");
        for (int indice = 0; indice < cuadrados.length; indice++) {
            System.out.print(cuadrados[indice] + ", ");
        }

        /*String print_numeros = "numeros = ";
        String print_cuadrados = "cuadrados = ";
        String print_procesos = "procesos = ";
        for (int indice = 0; indice < numeros.length; indice++) {
            print_numeros = print_numeros + numeros[indice] + ", ";
            print_cuadrados = print_cuadrados + cuadrados[indice] + ", ";
            print_procesos = print_procesos + procesos[indice] + ", ";
        }
        System.out.println(print_numeros);
        System.out.println(print_cuadrados);
        System.out.println(print_procesos);
         */
        // Suma sólo números pares
        int acumulador_pares = 0;
        for (int indice = 0; indice < numeros.length; indice++){
            boolean par = detectar_par(numeros[indice]);
            if(par==true){
                acumulador_pares = acumulador_pares+numeros[indice];
            }
        }
        System.out.print("La suma de los números pares es: "+ acumulador_pares);
    }
}
