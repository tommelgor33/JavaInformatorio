/*
     mas… sumas! : Realizar un programa donde se guarde un número entero en una
variable y que imprima por pantalla el resultado de la suma de todos los números
enteros desde 1 hasta ese número.
*/

package clases.estructurado;

import java.util.Scanner;

public class MasSumas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        int numero = sc.nextInt();

        int acum = 0;
        for (int i = 1; i <= numero; i++) {
            acum += i;
        }

        System.out.println("La suma de los números enteros desde 1 hasta " + numero + " es: " + acum);

        sc.close();
    }
}
