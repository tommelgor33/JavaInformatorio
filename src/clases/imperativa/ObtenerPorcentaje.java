/*
    Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número.
*/

package clases.imperativa;

import java.util.Scanner;

public class ObtenerPorcentaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero real: ");
        Float real = sc.nextFloat();

        System.out.println("ingrese un entero: ");
        float entero = sc.nextShort();
        entero = entero/100;

        System.out.printf("El %.2f de %.2f es: %.2f", entero, real, (real*entero));

        sc.close();
    }
}
