/*
    Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
*/

package clases.imperativa;

import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los catetos: ");
        short n1 = sc.nextShort();
        short n2 = sc.nextShort();

        System.out.printf("La hipotenusa para los catetos %d y %d es: %f",n1,n2,(Math.sqrt(Math.pow(n1,2)+Math.pow(n2,2))));

        sc.close();
    }
}
