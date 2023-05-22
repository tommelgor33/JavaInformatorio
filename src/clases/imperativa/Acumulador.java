/*
    Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:

Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15

El resultado mostrarlo por pantalla.
*/

package clases.imperativa;

import java.util.Scanner;

public class Acumulador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para ser multiplicados y divido por los numeron menores que 16: ");

        short n1 = sc.nextShort();
        short n2 = sc.nextShort();
        short n3 = (short)(n1*n2);
        int acu=0;

        for (short i = 1; i < 16; i++) {
            acu += n3/i;
        }

        System.out.printf("Multiplicamos %d por %d y acumulamos su division por 1 hasta 15%nDando como resultado: %d", n1, n2,acu);

        sc.close();
    }
}
