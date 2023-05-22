/*
    Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola. Usar bucles.
*/

package clases.estructurado;

import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamano de la base para el triangulo: ");
        short base = sc.nextShort();

        for (int i = 0; i <= base; i++) {
            System.out.println(' ');
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
        }

        sc.close();
    }
}
