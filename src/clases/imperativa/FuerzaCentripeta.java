/*
    Cálculo de la fuerza centrípeta:
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
de la trayectoria.
*/

package clases.imperativa;

import java.util.Scanner;

public class FuerzaCentripeta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese la masa, velocidad angular y el radio de la trayectoria: ");
        short masa = sc.nextShort();
        short velAngular = sc.nextShort();
        short radio = sc.nextShort();

        System.out.printf(" %d * %d^2 /%d = %.2f", masa, velAngular, radio, masa*Math.pow(velAngular,2)/radio);

        sc.close();
    }
}
