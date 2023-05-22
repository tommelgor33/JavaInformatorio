/*
    Cálculo de la velocidad final:
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
*/

package clases.imperativa;

import java.util.Scanner;

public class CalculoVelocidadFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la velocidad inicial y el tiempo transcurrido en segundos: ");
        short velInicial = sc.nextShort();
        short deltaTiempo = sc.nextShort();

        System.out.printf("%d m/s + 9.8m/s (gravedad) * %d s = %.2f m/s", velInicial, deltaTiempo, velInicial + 9.8 * deltaTiempo);

        sc.close();
    }
}
