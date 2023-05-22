/*
    Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.

    Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
*/

package clases.imperativa;

import java.util.Scanner;

public class CalculoCinetica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la masa y velocidad del objeto: ");
        short masa = sc.nextShort();
        short velocidad = sc.nextShort();

        System.out.printf("1/2 * %d * %d^2 = %d", masa, velocidad, 1/2 * masa * Math.pow(velocidad,2));
    }
}
