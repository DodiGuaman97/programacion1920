package Ejercicios_Proyecto;

/**
 *
 * @author Usuario
 */
public class Numeros_Perfectos {

    public static void main(String[] args) {

        int num1 = 1;
        int i = 1;
        int div = 0;
        while (div != num1) {
            div = 0;
            i = 1;
            num1 = num1 + 1;
            while (i < num1) {
                if (num1 % i == 0) {
                    div = div + i;

                }
                i = i + 1;
            }
        }

        div = 0;
        int num2 = num1;
        while (div != num2) {
            div = 0;
            i = 1;
            num2 = num2 + 1;
            while (i < num2) {
                if (num2 % i == 0) {
                    div = div + i;

                }
                i = i + 1;
            }
        }
        div = 0;
        int num3 = num2;
        while (div != num3) {
            div = 0;
            i = 1;
            num3 = num3 + 1;
            while (i < num3) {
                if (num3 % i == 0) {
                    div = div + i;

                }
                i = i + 1;
            }
        }
        div = 0;
        int num4 = num3;
        while (div != num4) {
            div = 0;
            i = 1;
            num4 = num4 + 1;
            while (i < num4) {
                if (num4 % i == 0) {
                    div = div + i;

                }
                i = i + 1;
            }
        }
        System.out.println("Los 4 primeros números perfectos son: ");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);

    }
   
    
}
