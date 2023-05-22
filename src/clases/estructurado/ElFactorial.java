/*
    El factorial : Realizar un programa que calcule el factorial de un número
*/

package clases.estructurado;

import java.util.Scanner;

public class ElFactorial {
    public static void main(String[] args) {
        int acumulador = 1;
        int i;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero para factorisar: ");
        i = sc.nextInt();

        for (int j = i; j > 0 ; j--) {
            acumulador = acumulador*j;
        }

        System.out.printf("El factorial de %d es: %d", i, acumulador);
    }
}
